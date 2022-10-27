

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static class Node implements Comparable<Node>{
		int end;
		int cost;
		public Node(int end, int cost) {
			this.end = end;
			this.cost = cost;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cost, o.cost);
		}
		
	}
	static int n;
	static int[] dist;
	static List<Node>[] graph;
	static boolean[] visited;
	static int INF = 1_000_000_000;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		graph = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		dist = new int[n + 1];
		Arrays.fill(dist, INF);
		int m = Integer.parseInt(st.nextToken());
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			graph[start].add(new Node(end, cost));
			graph[end].add(new Node(start, cost));
		}
		pq = new PriorityQueue<>();
		visited = new boolean[n + 1];
		dist[1] = 0;
		pq.offer(new Node(1, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			int end = cur.end;
			if(visited[end]) continue;
			else visited[end] = true;
			for(Node node : graph[end]) {
				dist[node.end] = Math.min(dist[node.end], dist[end] + node.cost);
				pq.offer(new Node(node.end, dist[node.end]));
			}
		}
		sb.append(dist[n]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}


}
