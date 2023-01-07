

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static boolean[][] d;
	static Queue<int[]> q;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new char[5001][5001];

		d = new boolean[5001][5001];
		q = new ArrayDeque<>();
		int cnt = 0;
		for(int i = 2500; i < a + 2500; i++) {
			String g = br.readLine();
			for(int j = 2500; j < b + 2500; j++) {
				if(g.charAt(j - 2500) == 'o') {
					q.offer(new int[] {i, j});
					c[i][j] = 'o';
					cnt++;
				}else {
					c[i][j] = '.';
				}
			}
		}
		int count = Integer.parseInt(br.readLine());
		while(true) {
			if(count == 0) break;
			int w = q.size();
			while(w --> 0) {
				int[] g = q.poll();
				for(int i = 0; i < 4; i++) {
					int j = g[0] + dx[i];
					int k = g[1] + dy[i];
					if(j >= 0 && k >= 0 && j < 5001 && k < 5001) {
						if(!d[j][k] && c[j][k] != 'o') {
							d[j][k] = true;
							c[j][k] = 'o';
							cnt++;
							q.offer(new int[] {j, k});
						}
					}
				
				}
			}
			count--;
		}
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
