

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int[][] c;
	static boolean[][] d;
	static Deque<int[]> q;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		b = Integer.parseInt(st.nextToken());
		a = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		q = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			String[] g = br.readLine().split("");
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(g[j]);
			}
		}
		q.offer(new int[] {0, 0, 0});
		d[0][0] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < a && j < b) {
					if(!d[i][j]) {
						d[i][j] = true;
						if(c[i][j] == 1) {
							c[i][j] = g[2] + 1;
							q.offer(new int[] {i, j, c[i][j]});
						}else {
							c[i][j] = g[2];
							q.offerFirst(new int[] {i, j, c[i][j]});
						}
					}
				}
			}
		}
		sb.append(c[a - 1][b - 1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
