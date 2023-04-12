
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node implements Comparable<Node>{
		int x;
		int y;
		int time;
		int size;
		
		public Node(int x, int y, int time, int size) {
			this.x = x;
			this.y = y;
			this.time = time;
			this.size = size;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if (this.time == o.time) {
				if (this.x == o.x) {
					return this.y - o.y;
				}
				return this.x - o.x;
			}
			return this.time - o.time;

		}

	}
	static int n;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static boolean[][] d;
	static Queue<Node> q;
	static List<Node> list;
	static Node shark;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 9) {
					map[i][j] = 0;
					shark = new Node(i, j, 0, 2);
				}
			}
		}
		while(true) {
			search();
			if(list.size() == 0) break;
			Collections.sort(list);
			eat();
			list.clear();
		}
		sb.append(shark.time);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void eat() {
		// TODO Auto-generated method stub
		Node c = list.get(0);
		cnt++;
		if(shark.size == cnt) {cnt = 0; shark.size++;}
		shark.time += c.time;
		map[c.x][c.y] = 0;
		shark.x = c.x;
		shark.y = c.y;
	}
	private static void search() {
		// TODO Auto-generated method stub
		q = new ArrayDeque<>();
		d = new boolean[n][n];
		q.offer(new Node(shark.x, shark.y, 0, 0));
		d[shark.x][shark.y] = true;
		while(!q.isEmpty()) {
			Node c = q.poll();
			if(map[c.x][c.y] != 0 && shark.size > map[c.x][c.y]) {
				list.add(new Node(c.x, c.y, c.time, map[c.x][c.y]));
			}
			for(int k = 0; k < 4; k++) {
				int i = c.x + dx[k];
				int j = c.y + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < n) {
					if(!d[i][j] && shark.size >= map[i][j]) {
						d[i][j] = true;
						q.offer(new Node(i, j, c.time + 1, 0));
					}
				}
			}
		}
	}

}
