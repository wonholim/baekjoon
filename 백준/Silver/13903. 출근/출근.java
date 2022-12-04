

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx;
	static int[] dy;
	static Queue<int[]> q;
	static int n;
	static int m;
	static int[][] c;
	static boolean[][] d;
	static int k;
	static int min;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		k = Integer.parseInt(br.readLine());
		dx = new int[k];
		dy = new int[k];
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			dx[i] = Integer.parseInt(st.nextToken());
			dy[i] = Integer.parseInt(st.nextToken());
		}
		min = Integer.MAX_VALUE;
		q = new ArrayDeque<>();
		d = new boolean[n][m];
		for(int i = 0; i < m; i++) {
			if(c[0][i] == 1) {
				d[0][i] = true;
				q.offer(new int[] {0, i, 0});
			}
		}
		bfs();
		if(min == Integer.MAX_VALUE) sb.append(-1);
		else sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == n - 1) {
				min = Math.min(g[2], min);
			}
			for(int i = 0; i < k; i++) {
				int a = g[0] + dx[i];
				int b = g[1] + dy[i];
				if(a >= 0 && b >= 0 && a < n && b < m) {
					if(!d[a][b] && c[a][b] == 1) {
						d[a][b] = true;
						q.offer(new int[] {a, b, g[2] + 1});
					}
				}
			}
		}
	}

}
