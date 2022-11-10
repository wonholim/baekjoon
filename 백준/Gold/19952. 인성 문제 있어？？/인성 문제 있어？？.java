

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[] start = new int[2];
	static int[] last = new int[2];
	static int[][] c;
	static boolean[][] d;
	static int a;
	static int b;
	static int str;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = new int[a][b];
			d = new boolean[a][b];
			q = new ArrayDeque<>();
			int block = Integer.parseInt(st.nextToken());
			str = Integer.parseInt(st.nextToken());
			start[0] = Integer.parseInt(st.nextToken()) - 1;
			start[1] = Integer.parseInt(st.nextToken()) - 1;
			d[start[0]][start[1]] = true;
			q.offer(new int[] {start[0], start[1], str});
			last[0] = Integer.parseInt(st.nextToken()) - 1;
			last[1] = Integer.parseInt(st.nextToken()) - 1;
			while(block --> 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken()) - 1;
				int y = Integer.parseInt(st.nextToken()) - 1;
				int h = Integer.parseInt(st.nextToken());
				c[x][y] = h;
			}
			while(!q.isEmpty()) {
				int[] g = q.poll();
				if(g[2] == 0) continue;
				for(int k = 0; k < 4; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(!d[i][j]) {
							if(c[i][j] != 0) {
								int h = Math.abs(c[g[0]][g[1]] - c[i][j]);
								if(h <= g[2]) {
									d[i][j] = true;
									q.offer(new int[] {i, j, g[2] - 1});
								}
							}else {
								d[i][j] = true;
								q.offer(new int[] {i, j, g[2] - 1});
							}
						}
					}
				}
			}
			if(d[last[0]][last[1]]) sb.append("잘했어!!\n");
			else sb.append("인성 문제있어??\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
