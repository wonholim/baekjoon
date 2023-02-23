

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int[][] c;
	static int[] dx = {1, 1, 1};
	static int[] dy = {-1, 0, 1};
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		c = new int[n][m];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				if(i == 0) {
					q.offer(new int[] {i, j, c[i][j], -1});
				}
			}
		}
		int min = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(n - 1 == g[0]) {
				min = Math.min(g[2], min);
			}else {
				for(int k = 0; k < 3; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < n && j < m) {
						if(k != g[3]) {
							q.offer(new int[] {i, j, c[i][j] + g[2], k});
						}
					}
				}
			}
		}
		sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
