

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
		int x, y, wall, day, move;
		public Node(int x, int y, int wall, int day, int move) {
			this.x = x;
			this.y = y;
			this.wall = wall;
			this.day = day;
			this.move = move;
		}
	}
	static char[][] c;
	static boolean[][][][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<Node> q;
	/*
	 * 4방향 + 제자리까지 가능
	 * 밤에는 벽을 부술 수 없다.
	 * 처음 시작은 낮으로 시작한다.
	 * 4차원 배열을 만들어서, 4방향 + 밤 낮 + 제자리
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		d = new boolean[w + 1][n][m][2];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		q.offer(new Node(0, 0, 0, 0, 1));
		d[0][0][0][0] = true;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			// day = 0;
			if(cur.x == n - 1 && cur.y == m - 1) {
				System.out.println(cur.move);
				return;
			}
			cur.day = 1 - cur.day;
			for(int k = 0; k < 4; k++) {
				int i = cur.x + dx[k];
				int j = cur.y + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < m) {
					if(cur.wall <= w && !d[cur.wall][i][j][cur.day]) {
						if(cur.wall <= w && c[i][j] == '0') {
							d[cur.wall][i][j][cur.day] = true;
							q.offer(new Node(i, j, cur.wall, cur.day, cur.move + 1));
						}else if(cur.wall <= w && c[i][j] == '1' && cur.day == 0) {
							d[cur.wall][i][j][cur.day] = true;
							q.offer(new Node(cur.x, cur.y, cur.wall, cur.day, cur.move + 1));
						}else if(cur.wall <= w && c[i][j] == '1' && cur.day == 1) {
							d[cur.wall][i][j][cur.day] = true;
							q.offer(new Node(i, j, cur.wall + 1, cur.day, cur.move + 1));
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