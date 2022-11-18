

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
	public static class Node implements Comparable<Node> {
		int from;
		long dist;

		public Node(int from, long dis) {
			this.from = from;
			this.dist = dis;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if(this.dist > o.dist) return 1;
			else if(this.dist < o.dist)return -1;
			else return 0;
		}

	}

	static ArrayList<Node>[] list;
	static long[] dis;
	static long[] dis2;
	static boolean[] visit;
	static long INF = 300_000_000_001L;
	static PriorityQueue<Node> pq;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t2 = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		while (t2 --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			list[i].add(new Node(j, dist));
			list[j].add(new Node(i, dist));
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int t3 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		dijkstra(x);
		dijkstra2(y);
		long min = 300_000_000_001L;
		while(t3 --> 0) {
			int next = Integer.parseInt(st.nextToken());
			
			if(dis[next] == INF || dis2[next] == INF) continue;
			
			min = Math.min(min, dis[next] + dis2[next]);
		}
		if(min == INF) sb.append(-1);
		else sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dijkstra(int x) {
		// TODO Auto-generated method stub
		dis = new long[n + 1];
		Arrays.fill(dis, INF);
		pq = new PriorityQueue<>();
		pq.offer(new Node(x, 0));
		dis[x] = 0;
		while (!pq.isEmpty()) {
			Node cur = pq.poll();
			if(cur.dist > dis[cur.from]) continue;
			for (Node next : list[cur.from]) {
				if (dis[next.from] > dis[cur.from] + next.dist) {
					dis[next.from] = dis[cur.from] + next.dist;
					pq.offer(new Node(next.from, dis[next.from]));
				}
			}
		}
	}
	private static void dijkstra2(int x) {
		// TODO Auto-generated method stub
		dis2 = new long[n + 1];
		Arrays.fill(dis2, INF);
		pq = new PriorityQueue<>();
		pq.offer(new Node(x, 0));
		dis2[x] = 0;
		while (!pq.isEmpty()) {
			Node cur = pq.poll();
			if(cur.dist > dis2[cur.from]) continue;
			for (Node next : list[cur.from]) {
				if (dis2[next.from] > dis2[cur.from] + next.dist) {
					dis2[next.from] = dis2[cur.from] + next.dist;
					pq.offer(new Node(next.from, dis2[next.from]));
				}
			}
		}
	}
}
