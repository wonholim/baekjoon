

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static Deque<int[]> q = new ArrayDeque<>();
	static int[][] c = new int[501][501];
	static boolean[][] d = new boolean[501][501];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
				for(int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
					c[i][j] = 1;
				}
			}
		}
		int t1 = Integer.parseInt(br.readLine());
		while(t1 --> 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
				for(int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
					c[i][j] = 2;
				}
			}
		}
		d[0][0] = true;
		q.offer(new int[] {0, 0, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == 500 && g[1] == 500) {
				System.out.println(g[2]);
				return;
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i <= 500 && j <= 500) {
					if(!d[i][j]) {
						if(c[i][j] == 0) {
							d[i][j] = true;
							q.offerFirst(new int[] {i, j, g[2]});
						}else if(c[i][j] == 1) {
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
