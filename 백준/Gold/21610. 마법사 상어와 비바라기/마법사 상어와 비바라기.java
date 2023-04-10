
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Cloud{
		int x;
		int y;
		public Cloud(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int n;
	static int m;;
	static int[][] c;
	static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
	static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
	static boolean[][] d;
	static Queue<Cloud> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new int[n][n];
		d = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new ArrayDeque<>();
		q.offer(new Cloud(n - 1, 0));
		q.offer(new Cloud(n - 1, 1));
		q.offer(new Cloud(n - 2, 0));
		q.offer(new Cloud(n - 2, 1));
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int dir = Integer.parseInt(st.nextToken()) - 1;
			int dis = Integer.parseInt(st.nextToken()) % n;
			go(dir, dis);
			water();
			for(int a = 0; a < n; a++) {
				for(int b = 0; b < n; b++) {
					if(!d[a][b] && c[a][b] >= 2) {
						q.offer(new Cloud(a, b));
						c[a][b] -= 2;
					}
				}
			}
			d = new boolean[n][n];
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sum += c[i][j];
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void water() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			Cloud cl = q.poll();
			int cnt = 0;
			for(int k = 1; k < 8; k = k + 2) {
				int i = cl.x + dx[k];
				int j = cl.y + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < n) {
					if(c[i][j] != 0) {
						cnt++;
					}
				}
			}
			c[cl.x][cl.y] += cnt;
		}
	}
	private static void go(int dir, int dis) {
		// TODO Auto-generated method stub
		int size = q.size();
		while(size --> 0) {
			Cloud cl = q.poll();
			int i = cl.x + (dx[dir] * dis);
			int j = cl.y + (dy[dir] * dis);
			if(i > n - 1) i = i - n;
			if(i < 0) i = i + n;
			if(j > n - 1) j = j - n;
			if(j < 0) j = j + n;
			d[i][j] = true;
			c[i][j]++;
			q.offer(new Cloud(i, j));
		}
	}
}
