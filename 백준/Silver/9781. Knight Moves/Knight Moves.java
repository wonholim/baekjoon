

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
	static int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
	static int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};
	static Queue<int[]> q;
	static boolean[][] d;
	static char[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		d = new boolean[n][m];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			String g = br.readLine();
			for(int j = 0; j < m; j++) {
				c[i][j] = g.charAt(j);
				if(c[i][j] == 'K') {
					q.offer(new int[] {i, j, 0});
					d[i][j] = true;
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(c[g[0]][g[1]] == 'X') {
				System.out.println(g[2]);
				return;
			}else {
				for(int k = 0; k < 8; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < n && j < m) {
						if(!d[i][j] && c[i][j] != '#') {
							d[i][j] = true;
							q.offer(new int[] {i, j, g[2] + 1});
						}
					}
				}
			}
		}
		sb.append(-1);
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
