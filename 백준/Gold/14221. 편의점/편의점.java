

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
	static int INF = 5000 * 100000 + 1;
	static PriorityQueue<Node> pq;
	static ArrayList<Node>[] list;
	static int[] last;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
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
		st = new StringTokenizer(br.readLine());
		int t2 = Integer.parseInt(st.nextToken());
		int t3 = Integer.parseInt(st.nextToken());
		int[] start = new int[t2];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t2; i++) {
			start[i] = Integer.parseInt(st.nextToken());
		}
		int max = INF;
		int index = 0;
		st = new StringTokenizer(br.readLine());
		last = new int[t3];
		for(int i = 0; i < t3; i++){
			last[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(start);
		dijkstra();
		for(int k : start) {
			if(max > dis[k]) {
				max = dis[k];
				index = k;
			}
		}
		sb.append(index);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dijkstra() {
		// TODO Auto-generated method stub
		pq = new PriorityQueue<>();
		dis = new int[n + 1];
		Arrays.fill(dis, INF);
		visit = new boolean[n + 1];
		for(int k : last) {
			pq.offer(new Node(k, 0));
			dis[k] = 0;
		}
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
	}
}
