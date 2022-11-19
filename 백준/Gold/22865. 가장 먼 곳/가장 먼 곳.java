

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
	static int n;
	static int[] dis;
	static boolean[] visit;
	static int INF = 2000000000;
	static PriorityQueue<Node> pq;
	static ArrayList<Node>[] list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			list[i].add(new Node(j, dist));
			list[j].add(new Node(i, dist));
		}
		int[] disA = dijkstra(a);
		int[] disB = dijkstra(b);
		int[] disC = dijkstra(c);
		int max = 0;
		int index = 0;
		for(int i = 1; i < n + 1; i++) {
			int min = 0;
			if(i == a || i == b || i == c) continue;
			if(disA[i] == INF || disB[i] == INF || disC[i] == INF) continue;
			min = Math.min(disA[i], disB[i]);
			min = Math.min(min, disC[i]);
			if(max < min) {
				max = min;
				index = i;
			}
		}
		sb.append(index);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static int[] dijkstra(int i) {
		// TODO Auto-generated method stub
		dis = new int[n + 1];
		Arrays.fill(dis, INF);
		dis[i] = 0;
		visit = new boolean[n + 1];
		pq = new PriorityQueue<>();
		pq.offer(new Node(i, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(visit[cur.from]) continue;
			visit[cur.from] = true;
			for(Node next : list[cur.from]) {
				if(dis[next.from] > dis[cur.from] + next.dist) {
					dis[next.from] = dis[cur.from] + next.dist;
					pq.offer(new Node(next.from, dis[next.from]));
				}
			}
		}
		return dis;
	}
}
