

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
	static int[][] c;
	static boolean[][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][a];
		d = new boolean[a][a];
		q = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < a; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;
		for(int k = 1; k <= b; k++) {
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < a; j++) {
					if(c[i][j] == k) {
						q.offer(new int[] {i, j, k});
						d[i][j] = true;
					}
				}
			}
		}
		while(t --> 0) {
			int k = q.size();
			while(k --> 0) {
				int[] g = q.poll();
				for(int i = 0; i < 4; i++) {
					int e = g[0] + dx[i];
					int r = g[1] + dy[i];
					if(e >= 0 && r >= 0 && e < a && r < a) {
						if(!d[e][r] && c[e][r] == 0) {
							d[e][r] = true;
							c[e][r] = g[2];
							q.offer(new int[] {e, r, g[2]});
						}
					}
				}
			}
		}
		if(d[x][y]) sb.append(c[x][y]);
		else sb.append(0);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
