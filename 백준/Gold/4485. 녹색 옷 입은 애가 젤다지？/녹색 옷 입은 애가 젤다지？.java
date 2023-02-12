

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node implements Comparable<Node>{
		int x, y, d;
		public Node(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
		public int compareTo(Node o) {
			return this.d - o.d;
		}
	}
	static int n;
	static int[][] c;
	static int[][] dist;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int INF = 1_000_000_000;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int count = 1;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			c = new int[n][n];
			dist = new int[n][n];
			pq = new PriorityQueue<>();
			for(int i = 0; i < n; i++) Arrays.fill(dist[i], INF);
			dist[0][0] = c[0][0];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					c[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			pq.offer(new Node(0, 0, dist[0][0]));
			while(!pq.isEmpty()) {
				Node next = pq.poll();
				for(int k = 0; k < 4; k++) {
					int q = next.x + dx[k];
					int w = next.y + dy[k];
					if(q >= 0 && w >= 0 && q < n && w < n) {
						if(dist[q][w] > next.d + c[next.x][next.y]) {
							dist[q][w] = next.d + c[next.x][next.y];
							pq.offer(new Node(q, w, dist[q][w]));
						}
					}
				}
			}
			sb.append("Problem " + count + ": " + (dist[n - 1][n - 1] + c[n - 1][n - 1]) + "\n");
			count++;
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
