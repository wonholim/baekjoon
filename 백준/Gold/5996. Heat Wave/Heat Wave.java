

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
	static int n;
	static int s;
	static int e;
	static int[] d;
	static boolean[] v;
	static List<Edge>[] g;
	static PriorityQueue<Edge> pq;
	static int INF = Integer.MAX_VALUE;
	public static class Edge implements Comparable<Edge>{
		int to;
		int cost;
		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return Integer.compare(cost, o.cost);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		g = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			g[i] = new ArrayList<>();
		}
		d = new int[n + 1];
		Arrays.fill(d, INF);
		v = new boolean[n + 1];
		int m = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			g[s].add(new Edge(to, cost));
			g[to].add(new Edge(s, cost));
		}
		pq = new PriorityQueue<>();
		d[s] = 0;
		pq.offer(new Edge(s, 0));
		while(!pq.isEmpty()) {
			Edge cur = pq.poll();
			if(v[cur.to]) continue;
			else v[cur.to] = true;
			for(Edge next : g[cur.to]) {
				d[next.to] = Math.min(d[next.to], d[cur.to] + next.cost);
				pq.offer(new Edge(next.to, d[next.to]));
			}
		}
		sb.append(d[e]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
