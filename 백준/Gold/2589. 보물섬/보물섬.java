

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static char[][] c;
	static int[][] cc;
	static boolean[][] d;
	static Queue<int[]> q;
	static Queue<int[]> qq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new char[a][b];
		cc = new int[a][b];
		q = new ArrayDeque<>();
		qq = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				c[i][j] = g.charAt(j);
				if(c[i][j] == 'W') {
					cc[i][j] = -1;
				}else {
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		int max = 0;
		while(!q.isEmpty()) {
			int[] w = q.poll();
			qq.offer(w);
			d = new boolean[a][b];
			d[w[0]][w[1]] = true;
			while(!qq.isEmpty()) {
				int[] g = qq.poll();
				for(int k = 0; k < 4; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(!d[i][j] && cc[i][j] != -1) {
							d[i][j] = true;
							max = Math.max(max, g[2] + 1);
							qq.offer(new int[] {i, j, g[2] + 1});
						}
					}
				}
			}
		}
		sb.append(max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
