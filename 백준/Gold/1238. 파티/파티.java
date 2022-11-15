

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static class Node implements Comparable<Node>{
		int from;
		int dist;
		public Node(int from, int dist) {
			this.from = from;
			this.dist = dist;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dist - o.dist;
		}
		
	}
	static ArrayList<Node>[] list;
	static ArrayList<Node>[] back;
	static int[] dist;
	static int[] dist_b;
	static int INF = 99999999;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 사람수
		int m = Integer.parseInt(st.nextToken()); // 마을?
		int x = Integer.parseInt(st.nextToken()); // 시작점
		list = new ArrayList[n + 1];
		back = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
			back[i] = new ArrayList<>();
		}
		dist = new int[n + 1];
		visit = new boolean[n + 1];
		Arrays.fill(dist, INF);
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			list[i].add(new Node(j, d));
			back[j].add(new Node(i, d));
		}
		PriorityQueue<Node> pq = new PriorityQueue<>();
		dist[x] = 0;
		pq.offer(new Node(x, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(visit[cur.from]) continue;
			else visit[cur.from] = true;
			
			for(Node next : list[cur.from]) {
				if(dist[next.from] > dist[cur.from] + next.dist) {
					dist[next.from] = dist[cur.from] + next.dist;
					pq.offer(new Node(next.from, dist[next.from]));
				}
			}
			
		}
		dist_b = new int[n + 1];
		visit = new boolean[n + 1];
		Arrays.fill(dist_b, INF);
		pq = new PriorityQueue<>();
		dist_b[x] = 0;
		pq.offer(new Node(x, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(visit[cur.from]) continue;
			else visit[cur.from] = true;
			
			for(Node next : back[cur.from]) {
				if(dist_b[next.from] > dist_b[cur.from] + next.dist) {
					dist_b[next.from] = dist_b[cur.from] + next.dist;
					pq.offer(new Node(next.from, dist_b[next.from]));
				}
			}
			
		}
		int max = 0;
		for(int i = 1; i < n + 1; i++) {
			max = Math.max(max, dist[i] + dist_b[i]);
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
