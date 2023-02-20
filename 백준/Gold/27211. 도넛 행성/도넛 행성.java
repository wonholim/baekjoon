

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
	static int m;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> q;
	static int count;
	static boolean[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new boolean[n][m];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int k = Integer.parseInt(st.nextToken());
				if(k == 1) c[i][j] = true;
				else c[i][j] = false;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!c[i][j]) {
					q.offer(new int[] {i, j});
					c[i][j] = true;
					BFS();
					count++;
				}
			}
		}
		sb.append(count);
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BFS() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < m) {
					if(!c[i][j]) {
						c[i][j] = true;
						q.offer(new int[] {i, j});
					}
				}else {
					if(i == n) {
						i = 0;
					}else if(j == m) {
						j = 0;
					}else if(i == -1) {
						i = n - 1;
					}else if(j == -1) {
						j = m - 1;
					}
					if(!c[i][j]) {
						c[i][j] = true;
						q.offer(new int[] {i, j});
					}
				}
			}
		}
	}

}
