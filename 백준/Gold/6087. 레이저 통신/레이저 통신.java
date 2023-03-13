
import java.io.*;
import java.util.*;

public class Main {
	static class Search implements Comparable<Search> {
		int moveX, moveY, cur, mirror;
		public Search(int moveX, int moveY, int cur, int mirror) {
			this.moveX = moveX;
			this.moveY = moveY;
			this.cur = cur;
			this.mirror = mirror;
		}
		public int compareTo(Search o) {
			return this.cur - o.cur;
		}
	}
	static char[][] c;
	static int[][][] count;
	static PriorityQueue<Search> pq;
	static int n;
	static int m;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int x;
	static int y;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		count = new int[4][n][m];
		pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			String k = br.readLine();
			for (int j = 0; j < m; j++) {
				c[i][j] = k.charAt(j);
				if (c[i][j] == 'C' && pq.isEmpty()) {
					pq.offer(new Search(i, j, 0, 0));
					pq.offer(new Search(i, j, 1, 0));
					pq.offer(new Search(i, j, 2, 0));
					pq.offer(new Search(i, j, 3, 0));
					count[0][i][j] = 0;
					count[1][i][j] = 0;
					count[2][i][j] = 0;
					count[3][i][j] = 0;
				} else if (c[i][j] == 'C' && !pq.isEmpty()) {
					x = i;
					y = j;
				}
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					count[i][j][k] = 987654321;
				}
			}
		}
		int min = 987654321;
		while (!pq.isEmpty()) {
			Search g = pq.poll();
			if (g.moveX == x && g.moveY == y) {
				min = Math.min(min, g.mirror);
				continue;
			}
			for (int k = 0; k < 4; k++) {
				int i = g.moveX + dx[k];
				int j = g.moveY + dy[k];
				if (i >= 0 && j >= 0 && i < n && j < m) {
					if(c[i][j] != '*') {
						int tmp = g.mirror;
						if(g.cur != k) tmp++;
						if (count[k][i][j] > tmp) {
							count[k][i][j] = tmp;
							pq.offer(new Search(i, j, k, tmp));
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