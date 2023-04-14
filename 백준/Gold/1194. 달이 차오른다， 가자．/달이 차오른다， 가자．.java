import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final int KEYSIZE = 6;
	static int n, m;
	static char[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int startx = 0, starty = 0;
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j] == '0') {
					startx = i;
					starty = j;
					map[i][j] = '.';
				}
			}
		}
		sb.append(bfs(startx, starty));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int bfs(int startX, int startY) {
		int[][] dis = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		Queue<Point> q = new ArrayDeque<>();
		int[][][] visited = new int[n][m][1 << KEYSIZE + 1];
		q.add(new Point(startX, startY, 0));
		visited[startX][startY][0] = 1;
		
		while (!q.isEmpty()) {
			Point now = q.poll();
			for (int[] d : dis) {
				int x = now.x + d[0];
				int y = now.y + d[1];
				int bit = now.bit;
				if (x < 0 || y < 0 || x >= n || y >= m || map[x][y] == '#') continue;
				if (map[x][y] == '1') {
					return visited[now.x][now.y][now.bit];
				}
				if (visited[x][y][bit] > 0) continue;
				if (map[x][y] <= 'f' && map[x][y] >= 'a') { //열쇠 찾음
					bit |= 1 << (map[x][y] - 'a' + 1);
				} else if (map[x][y] <= 'F' && map[x][y] >= 'A' 
						&& (now.bit & 1 << (map[x][y] - 'A' + 1)) <= 0) {
					continue;
				}
				q.add(new Point(x, y, bit));
				visited[x][y][bit] = visited[now.x][now.y][now.bit] + 1;
			}
		}
		return -1;
	}
	
	static class Point {
		int x, y;
		int bit;

		public Point(int x, int y, int bit) {
			super();
			this.x = x;
			this.y = y;
			this.bit = bit;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + ", bit=" + Integer.toBinaryString(bit) + "]";
		}	
	}

}