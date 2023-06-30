import java.io.*;
import java.util.*;

public class Main {
	static int a, b, x, y;
	static Queue<int[]> q = new ArrayDeque<>();
	static boolean[][] d = new boolean[10][9];
	static int[] dx = {-1, -1, 1, 1, 0, 0, 0, 0};
	static int[] dy = {0, 0, 0, 0, 1, 1, -1, -1};
	static int[] cx = {-1, -1, 1, 1, -1, 1, -1, 1};
	static int[] cy = {1, -1, 1, -1, 1, 1, -1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		q.offer(new int[] {a, b, 0});
		d[a][b] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == x && g[1] == y) {
				System.out.println(g[2]);
				return;
			}
			for(int k = 0; k < 8; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i < 0 || j < 0 || i > 9 || j > 8 || (x == i && y == j)) continue;
				i += cx[k];
				j += cy[k];
				if(i < 0 || j < 0 || i > 9 || j > 8 || (x == i && y == j)) continue;
				i += cx[k];
				j += cy[k];
				if(i < 0 || j < 0 || i > 9 || j > 8 || d[i][j]) continue;
				d[i][j] = true;
				q.offer(new int[] {i, j, g[2] + 1});
			}
		}
		System.out.println(-1);
	}

}
