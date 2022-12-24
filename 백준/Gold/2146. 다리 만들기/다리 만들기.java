

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] c;
	static boolean[][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int count = 1;
	static Queue<int[]> node;
	static int max = 1001;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		c = new int[n][n];
		d = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!d[i][j] && c[i][j] == 1) {
					c[i][j] = count;
					d[i][j] = true;
					dfs(i, j);
					count++;
				}
			}
		}
		for(int k = 1; k <= count; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(c[i][j] == k) {
						node = new ArrayDeque<>();
						d = new boolean[n][n];
						d[i][j] = true;
						node.offer(new int[] {i, j, 0, k});
						bfs();
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
	private static void bfs() {
		// TODO Auto-generated method stub
		while(!node.isEmpty()) {
			int[] g = node.poll();
			for(int k = 0; k < 4; k++) {
				int q = g[0] + dx[k];
				int w = g[1] + dy[k];
				if(q >= 0 && w >= 0 && q < n && w < n) {
					if(!d[q][w] && c[q][w] != g[3]) {
						d[q][w] = true;
						if(c[q][w] != 0) {
							if(g[2] > max) continue;
							else max = Math.min(max, g[2]);
						}
						node.offer(new int[] {q, w, g[2] + 1, g[3]});
					}
				}
			}
		}
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < n) {
				if(!d[q][w] && c[q][w] == 1) {
					d[q][w] = true;
					c[q][w] = count;
					dfs(q, w);
				}
			}
		}
	}

}
