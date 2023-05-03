
import java.io.*;
import java.util.*;
public class Main {
	static class Node{
		int x, y, z, dis;
		public Node(int x, int y, int z, int dis) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.dis = dis;
		}
	}
	static final int n = 5;
	static boolean[][][][] map;
	static boolean[][][] v;
	static int min = Integer.MAX_VALUE;
	static Queue<Node> q;
	static int[] dx = {1, -1, 0, 0, 0, 0};
	static int[] dy = {0, 0, 1, -1, 0, 0};
	static int[] dz = {0 , 0, 0, 0, 1, -1};
	static int[] sx = {0, 0, n - 1, n - 1};
	static int[] sy = {0, n - 1, 0, n - 1};
	static int[] lx = {n - 1, n - 1, 0, 0};
	static int[] ly = {n - 1, 0, n - 1, 0};
	static ArrayList<int[]> list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		map = new boolean[n][n - 1][n][n];
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[k][0][i][j] = (Integer.parseInt(st.nextToken()) == 1 ? true : false);
				}
			}
		}
		for(int i = 0; i < n; i++) {
			mix(i);
		}
		list = new ArrayList<>();
		cooking(0, new int[5], new int[] {0, 1, 2, 3, 4}, new boolean[5]);
		OUT :
		for (int a = 0; a < n - 1; a++) {
			for (int b = 0; b < n - 1; b++) {
				for (int c = 0; c < n - 1; c++) {
					for (int d = 0; d < n - 1; d++) {
						for (int e = 0; e < n - 1; e++) {
							int[] f = new int[n];
							f[0] = a;
							f[1] = b;
							f[2] = c;
							f[3] = d;
							f[4] = e;
							for (int[] cooooooooook : list) {
								q = new ArrayDeque<>();
								v = new boolean[n][n][n];
								if (!map[cooooooooook[0]][a][0][0])
									continue;
								if (!map[cooooooooook[n - 1]][e][n - 1][n - 1])
									continue;
								v[0][0][0] = true;
								q.offer(new Node(0, 0, 0, 0));
								while (!q.isEmpty()) {
									Node cur = q.poll();
									if (cur.x == n - 1 && cur.y == n - 1 && cur.z == n - 1) {
										min = Math.min(min, cur.dis);
										break;
									}
									if(min == 12) break OUT;
									for (int o = 0; o < 6; o++) {
										int i = cur.x + dx[o];
										int j = cur.y + dy[o];
										int k = cur.z + dz[o];
										if (i >= 0 && j >= 0 && k >= 0 && i < n && j < n && k < n) {
											if (map[cooooooooook[k]][f[k]][i][j] && !v[i][j][k]) {
												v[i][j][k] = true;
												q.offer(new Node(i, j, k, cur.dis + 1));
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		sb.append(min == Integer.MAX_VALUE ? -1 : min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void cooking(int depth, int[] cook, int[] rec, boolean[] vis) {
		// TODO Auto-generated method stub
		if(n == depth) {
			int[] tmp = new int[n];
			for(int i = 0; i < n; i++) tmp[i] = cook[i];
			list.add(tmp);
			return;
		}
		for(int i = 0; i < n; i++) {
			if(!vis[i]) {
				vis[i] = true;
				cook[depth] = rec[i];
				cooking(depth + 1, cook, rec, vis);
				vis[i] = false;
			}
		}
	}
	private static void mix(int x) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 3; k++) {
			boolean[][] tmp = new boolean[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					tmp[i][j] = map[x][k][i][j];
				}
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					map[x][k + 1][i][j] = tmp[n - j - 1][i]; 
				}
			}
		}
	}

}
