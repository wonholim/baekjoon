

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> q;
	static int[][] c;
	static boolean[][] d;
	static int a;
	static int b;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		c = new int[a][b];
		d = new boolean[a][b];
		for(int i = 0; i < a; i++) {
			String[] g = br.readLine().split("");
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(g[j]);
				if(c[i][j] == 2) {
					d[i][j] = true;
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < a && j < b) {
					if(!d[i][j] && c[i][j] != 1) {
						d[i][j] = true;
						if(c[i][j] > 2) {
							System.out.println("TAK\n" + (g[2] + 1));
							return;
						}else {
							c[i][j] = g[2] + 1;
							q.offer(new int[] {i, j, c[i][j]});
						}
					}
				}
			}
		}
		sb.append("NIE");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
