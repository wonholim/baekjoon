

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
	static int[][] c;
	static int[][] e;
	static boolean[][] d;
	static Queue<int[]> q;
	static int a;
	static int b;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new int[n + 1][m + 1];
		e = new int[n + 1][m + 1];
		d = new boolean[n + 1][m + 1];
		q = new ArrayDeque<>();
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int[] dx = {x,-x,x,-x,y,-y,y,-y};
		int[] dy = {y,y,-y,-y,x,x,-x,-x};
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				int k = Integer.parseInt(st.nextToken());
				if(k == 2 || k == 0) {
					e[i][j] = -1;
				}else if(k == 3) {
					q.offer(new int[] {i, j, 0});
				}else if(k == 4) {
					a = i;
					b = j;
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 8; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i > 0 && j > 0 && i <= n && j <= m) {
					if(!d[i][j] && e[i][j] != -1) {
						d[i][j] = true;
						c[i][j] = g[2] + 1;
						q.offer(new int[] {i, j, g[2] + 1});
					}
				}
			}
		}
		sb.append(c[a][b]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
