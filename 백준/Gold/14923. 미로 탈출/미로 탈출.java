
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int i;
		int j;
		int w;
		int d;
		public Node(int i, int j, int w, int d) {
			this.i = i;
			this.j = j;
			this.w = w;
			this.d = d;
		}
	}
	static int n;
	static int m;
	static int[][] c;
	static boolean[][][] d;
	static Queue<Node> q;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;

		st = new StringTokenizer(br.readLine());
		int xx = Integer.parseInt(st.nextToken()) - 1;
		int yy = Integer.parseInt(st.nextToken()) - 1;
		c = new int[n][m];
		d = new boolean[2][n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		d[0][x][y] = true;
		d[1][x][y] = true;
		q.offer(new Node(x, y, 0, 0));
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.i == xx && cur.j == yy) {
				System.out.println(cur.d);
				return;
			}
			for(int k = 0; k < 4; k++) {
				int a = cur.i + dx[k];
				int b = cur.j + dy[k];
				if(a >= 0 && b >= 0 && a < n && b < m) {
					if(!d[cur.w][a][b]) {
						if(cur.w == 1 && c[a][b] == 0) {
							d[cur.w][a][b] = true;
							q.offer(new Node(a, b, cur.w, cur.d + 1));
						}else if(cur.w == 0 && c[a][b] == 1) {
							d[cur.w + 1][a][b] = true;
							q.offer(new Node(a, b, cur.w + 1, cur.d + 1));
						}else if(c[a][b] == 0) {
							d[cur.w][a][b] = true;
							q.offer(new Node(a, b, cur.w, cur.d + 1));
						}
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
