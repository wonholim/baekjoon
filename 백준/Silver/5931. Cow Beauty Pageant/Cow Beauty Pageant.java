

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int x;
	static int y;
	static int[][] c;
	static boolean[][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> q;
	static int count = 1;
	static int max = 5000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		c = new int[x][y];
		d = new boolean[x][y];
		for(int i = 0; i < x; i++) {
			String g = br.readLine();
			for(int j = 0; j < y; j++) {
				if(g.charAt(j) == 'X') {
					c[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(!d[i][j] && c[i][j] == 1) {
					d[i][j] = true;
					c[i][j] = count;
					dfs(i, j, count);
					count++;
				}
			}
		}
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(c[i][j] == 1) {
					q = new ArrayDeque<>();
					d = new boolean[x][y];
					d[i][j] = true;
					q.offer(new int[] {i, j, 0});
					bfs();
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
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int a = g[0] + dx[k];
				int s = g[1] + dy[k];
				if(a >= 0 && s >= 0 && a < x && s < y) {
					if(!d[a][s] && c[a][s] != 1) {
						d[a][s] = true;
						if(c[a][s] == 2) {
							max = Math.min(max, g[2]);
						}
						q.offer(new int[] {a, s, g[2] + 1});
					}
				}
			}
		}
	}
	private static void dfs(int i, int j, int count) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int a = i + dx[k];
			int s = j + dy[k];
			if(a >= 0 && s >= 0 && a < x && s < y) {
				if(!d[a][s] && c[a][s] != 0) {
					d[a][s] = true;
					c[a][s] = count;
					dfs(a, s, count);
				}
			}
		}
	}

}
