

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static Deque<int[]> q;
	static boolean[][][] d;
	static int[][][] cc;
	static int a;
	static int b;
	static int c;
	static int x;
	static int y;
	static int z;
	static int[] dx = { 1, -1, 0, 0, 0, 0 };
	static int[] dy = { 0, 0, 1, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0 && c == 0)
				break;
			q = new ArrayDeque<>();
			cc = new int[c][a][b];
			d = new boolean[c][a][b];
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < a; j++) {
					String g = br.readLine();
					for (int k = 0; k < b; k++) {
						if (g.charAt(k) == 'S') {
							d[i][j][k] = true;
							q.offer(new int[] { i, j, k, 0 });
						} else if (g.charAt(k) == '#') {
							cc[i][j][k] = -1;
							d[i][j][k] = true;
						} else if (g.charAt(k) == 'E') {
							z = i;
							x = j;
							y = k;
						}
					}
				}
				br.readLine();
			}
			while (!q.isEmpty()) {
				int[] g = q.poll();
				for (int k = 0; k < 6; k++) {
					int zz = g[0] + dz[k];
					int xx = g[1] + dx[k];
					int yy = g[2] + dy[k];
					if (zz >= 0 && xx >= 0 && yy >= 0 && zz < c && xx < a && yy < b) {
						if (!d[zz][xx][yy] && cc[zz][xx][yy] != -1) {
							cc[zz][xx][yy] = g[3] + 1;
							d[zz][xx][yy] = true;
							q.offer(new int[] { zz, xx, yy, cc[zz][xx][yy] });
						}
					}
				}
			}
			if (d[z][x][y]) {
				sb.append("Escaped in " + cc[z][x][y] + " minute(s).\n");
			} else {
				sb.append("Trapped!\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
