

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
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[][] c;
	static boolean[][] d;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken()) + 500;
		y = Integer.parseInt(st.nextToken()) + 500;
		int t = Integer.parseInt(st.nextToken());
		c = new int[1001][1001];
		d = new boolean[1001][1001];
		q = new ArrayDeque<>();
		q.offer(new int[] {500, 500, 0});
		d[500][500] = true;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) + 500;
			int j = Integer.parseInt(st.nextToken()) + 500;
			c[i][j] = -1;
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == x && g[1] == y) {
				sb.append(g[2]);
				break;
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < 1001 && j < 1001) {
					if(!d[i][j] && c[i][j] != -1) {
						d[i][j] = true;
						q.offer(new int[] {i, j, g[2] + 1});
					}
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
