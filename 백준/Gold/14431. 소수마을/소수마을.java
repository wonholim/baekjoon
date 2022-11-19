

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
	static ArrayList<Node>[] list;
	static boolean[] check = new boolean[100001];
	static ArrayList<int[]> point;
	static int INF = 2000000000;
	static int[] dist;
	static boolean[] visit;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		check[0] = true;
		check[1] = true;
		for(int i = 2; i <= 100000; i++) {
			if(check[i]) continue;
			for(int j = 2 * i; j <= 100000; j = i + j) {
				check[j] = true;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		n = t + 2;
		point = new ArrayList<>();
		point.add(new int[] {x, y});
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			point.add(new int[] {x2, y2});
		}
		point.add(new int[] {x1, y1});
		for(int i = 0; i < n; i++) {
			int[] start = point.get(i);
			for(int j = i + 1; j < n; j++) {
				int[] last = point.get(j);
				int k = (int) Math.floor(Math.sqrt(Math.pow(last[0] - start[0], 2) + Math.pow(last[1] - start[1], 2)));
				if(!check[k]) {list[i + 1].add(new Node(j + 1, k)); list[j + 1].add(new Node(i + 1, k));}
			}
		}
		dijkstra(1);
		if(dist[n] != INF) sb.append(dist[n]);
		else sb.append(-1);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dijkstra(int i) {
		// TODO Auto-generated method stub
		dist = new int[n + 1];
		visit = new boolean[n + 1];
		Arrays.fill(dist, INF);
		dist[i] = 0;
		pq = new PriorityQueue<>();
		pq.offer(new Node(i, 0));
		while(!pq.isEmpty()){
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
	}

}
