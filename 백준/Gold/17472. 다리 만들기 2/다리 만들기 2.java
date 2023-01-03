


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge>{
		int t;
		int f;
		int d;
		public Edge(int t, int f, int d) {
			this.t = t;
			this.f = f;
			this.d = d;
		}
		public int compareTo(Edge o) {
			return this.d - o.d;
		}
	}
	static int n;
	static int m;
	static int[][] c;
	static boolean[][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int count = 1;
	static Queue<int[]> node;
	static int max = 1001;
	static PriorityQueue<Edge> pq;
	static int[] parent;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new int[n][m];
		d = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!d[i][j] && c[i][j] == 1) {
					c[i][j] = count;
					d[i][j] = true;
					dfs(i, j);
					count++;
				}
			}
		}
		parent = new int[count];
		for(int i = 1; i < count; i++) {
			parent[i] = i;
		}
		pq = new PriorityQueue<>();
		for(int k = 1; k < count; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(c[i][j] == k) {
						node = new ArrayDeque<>();
						max = 1001;
						d = new boolean[n][m];
						d[i][j] = true;
						node.offer(new int[] {i, j, 0, k});
						bfs();
					}
				}
			}
		}
		int sum = 0;
		int cnt = 1;
		while(!pq.isEmpty()) {
			Edge cur = pq.poll();
			if(!find(cur.t, cur.f)) {
				sum += cur.d;
				cnt++;
				unionParent(cur.t, cur.f);
			}
		}
		if(count - 1 == cnt) sb.append(sum);
		else sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if (x > y) parent[y] = x;
		else parent[x] = y;
	}

	private static boolean find(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}

	private static int getParent(int x) {
		// TODO Auto-generated method stub
		if (parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		int[] g = node.poll();
		for(int k = 0; k < 4; k++) {
			int q = g[0] + dx[k];
			int w = g[1] + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(!d[q][w] && c[q][w] != g[3]) {
					d[q][w] = true;
					node.offer(new int[] {q, w, g[2] + 1, g[3], k});
				}
			}
		}
		while(!node.isEmpty()) {
			g = node.poll();
			int q = g[0] + dx[g[4]];
			int w = g[1] + dy[g[4]];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(!d[q][w] && c[q][w] != g[3]) {
					d[q][w] = true;
					if(c[q][w] != 0) {
						if(g[2] > max || g[2] == 1) continue;
						else {
							max = Math.min(max, g[2]);
							pq.offer(new Edge(g[3], c[q][w], max));
						}
					}
					node.offer(new int[] {q, w, g[2] + 1, g[3], g[4]});
				}
			}
		}
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(!d[q][w] && c[q][w] == 1) {
					d[q][w] = true;
					c[q][w] = count;
					dfs(q, w);
				}
			}
		}
	}

}
