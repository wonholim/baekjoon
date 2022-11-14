

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> q;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] c;
	static boolean[][] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		q = new ArrayDeque<>();
		c = new int[5][5];
		d = new boolean[5][5];
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		d[x][y] = true;
		q.offer(new int[] {x, y, 0});
		int search = 1;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(c[g[0]][g[1]] == search) {
				q.clear();
				d = new boolean[5][5];
				d[g[0]][g[1]] = true;
				q.offer(new int[] {g[0], g[1], g[2]});
				search++;
				if(search > 6) {
					System.out.println(g[2]);
					return;
				}else {
					continue;
				}
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < 5 && j < 5) {
					if(!d[i][j] && c[i][j] != -1) {
						d[i][j] = true;
						q.offer(new int[] {i, j, g[2] + 1});
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
