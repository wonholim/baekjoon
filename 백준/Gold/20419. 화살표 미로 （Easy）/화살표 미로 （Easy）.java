
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int x, y, wall, move;
		public Node(int x, int y, int wall) {
			this.x = x;
			this.y = y;
			this.wall = wall;
		}
	}
	static char[][] c;
	static boolean[][][] d;
	static Queue<Node> q;
	static int n;
	static int m;
	static int w;
	static char[] direction = {};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken()) + 1;
		c = new char[n][m];
		d = new boolean[w + 1][n][m];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		d[0][0][0] = true;
		q.offer(new Node(0, 0, 0));
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.x == n - 1 && cur.y == m - 1) {
				System.out.println("Yes");
				return;
			}
			int i = cur.x;
			int j = cur.y;
			if(c[i][j] == 'U') {i--;}
			else if(c[i][j] == 'D') {i++;}
			else if(c[i][j] == 'R') {j++;}
			else if(c[i][j] == 'L') {j--;}
			OneSearch(i, j, cur);
			secondSearch(c[cur.x][cur.y], cur);
			thirdSearch(c[cur.x][cur.y], cur);
		}
		sb.append("No");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void thirdSearch(char dir, Node cur) {
		// TODO Auto-generated method stub
		int i = cur.x;
		int j = cur.y;
		for(int k = 2; k <= w; k++) {
			if(dir == 'U') dir = 'L';
			else if(dir == 'L') dir = 'D';
			else if(dir == 'D') dir = 'R';
			else if(dir == 'R') dir = 'U';
			
			if(dir == 'U') {i--;}
			else if(dir == 'D') {i++;}
			else if(dir == 'R') {j++;}
			else if(dir == 'L') {j--;}
			if(i >= 0 && j >= 0 && i < n && j < m) {
				if(!d[k][i][j]) {
					d[k][i][j] = true;
					q.offer(new Node(i, j, k));
				}
			}
			
		}
		
	}
	private static void secondSearch(char dir, Node cur) {
		// TODO Auto-generated method stub
		int i = cur.x;
		int j = cur.y;
		for(int k = 1; k < w; k++) {
			if(dir == 'U') dir = 'R';
			else if(dir == 'R') dir = 'D';
			else if(dir == 'D') dir = 'L';
			else if(dir == 'L') dir = 'U';
			
			if(dir == 'U') {i--;}
			else if(dir == 'D') {i++;}
			else if(dir == 'R') {j++;}
			else if(dir == 'L') {j--;}
			if(i >= 0 && j >= 0 && i < n && j < m) {
				if(!d[k][i][j]) {
					d[k][i][j] = true;
					q.offer(new Node(i, j, k));
				}
			}
			
		}
	}
	private static void OneSearch(int i, int j, Node cur) {
		// TODO Auto-generated method stub
		if (i >= 0 && j >= 0 && i < n && j < m) {
			if (!d[cur.wall][i][j]) {
				d[cur.wall][i][j] = true;
				q.offer(new Node(i, j, cur.wall));
			}

		}
	}
}