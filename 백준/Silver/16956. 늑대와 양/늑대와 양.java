

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
	static int n;
	static int m;
	static char[][] c;
	static Queue<int[]> q;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static boolean[][] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		d = new boolean[n][m];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			String g = br.readLine();
			for(int j = 0; j < m; j++) {
				c[i][j] = g.charAt(j);
				if(c[i][j] == 'S') {
					d[i][j] = true;
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g= q.poll();
			if(c[g[0]][g[1]] == 'W') {
				System.out.println("0");
				return;
			}
			for (int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if (i >= 0 && j >= 0 && i < n && j < m) {
					if (!d[i][j] && g[2] != 1) {
						d[i][j] = true;
						q.offer(new int[] { i, j, g[2] + 1 });
					}
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(c[i][j] == 'S') {
					dfs(i, j);
				}
			}
		}
		sb.append(1 + "\n");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sb.append(c[i][j]);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(c[q][w] == '.') {
					c[q][w] = 'D';
				}
			}
		}
	}

}
