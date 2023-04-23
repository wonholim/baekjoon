
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static int count = 0;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		c = new int[12][6];

		for (int i = 0; i < 12; i++) {
			String line = br.readLine();
			for (int j = 0; j < 6; j++) {
				if (line.charAt(j) == 'R')
					c[i][j] = 1;
				else if (line.charAt(j) == 'G')
					c[i][j] = 2;
				else if (line.charAt(j) == 'B')
					c[i][j] = 3;
				else if (line.charAt(j) == 'P')
					c[i][j] = 4;
				else if (line.charAt(j) == 'Y')
					c[i][j] = 5;
			}
		}

		go();
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void go() {
		// TODO Auto-generated method stub
		while (true) {
			boolean[][] d = new boolean[12][6];
			Queue<int[]> q = new ArrayDeque<>();
			boolean check = false;
			for (int i = 1; i <= 5; i++) {
				for (int a = 0; a < 12; a++) {
					for (int b = 0; b < 6; b++) {
						if (!d[a][b] && c[a][b] == i) {
							int cnt = 1;
							ArrayList<int[]> list = new ArrayList<>();
							list.add(new int[] { a, b });
							d[a][b] = true;
							q.offer(new int[] { a, b });
							while (!q.isEmpty()) {
								int[] g = q.poll();
								for (int k = 0; k < 4; k++) {
									int x = g[0] + dx[k];
									int y = g[1] + dy[k];
									if (x >= 0 && y >= 0 && x < 12 && y < 6) {
										if (!d[x][y] && c[x][y] == i) {
											d[x][y] = true;
											list.add(new int[] { x, y });
											q.offer(new int[] { x, y });
											cnt++;
										}
									}
								}
							}
							if (cnt >= 4) {
								check = true;
								for (int[] g : list) {
									c[g[0]][g[1]] = 0;
								}
							}
						}
					}
				}
			}
			if (!check) return;
			count++;
			sort();
		}
	}

	private static void sort() {
		// TODO Auto-generated method stub
		Queue<int[]> q = new ArrayDeque<>();
		for (int i = 0; i < 6; i++) {
			for (int j = 11; j >= 0; j--) {
				if (c[j][i] != 0) {
					q.offer(new int[] { j, i });
				}
			}
		}
		while (!q.isEmpty()) {
			int[] g = q.poll();
			int i = g[0] + dx[0];
			int j = g[1] + dy[0];
			if (i >= 0 && j >= 0 && i < 12 && j < 6) {
				if (c[i][j] == 0) {
					c[i][j] = c[g[0]][g[1]];
					c[g[0]][g[1]] = 0;
					q.offer(new int[] { i, j });
				}
			}
		}
	}
}
