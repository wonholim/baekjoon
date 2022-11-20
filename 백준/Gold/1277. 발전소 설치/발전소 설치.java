

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
		double dist;
		public Node(int from, double dist) {
			// TODO Auto-generated constructor stub
			this.from = from;
			this.dist = dist;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if(this.dist > o.dist) return 1;
			else if(this.dist == o.dist) return 0;
			else return -1;
		}
	}
	static int n;
	static ArrayList<int[]> point;
	static long INF = 500000000000L;
	static ArrayList<Node>[] list;
	static PriorityQueue<Node> pq;
	static double[] dis;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		int t = Integer.parseInt(st.nextToken());
		double limit = Double.parseDouble(br.readLine());
		point = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			point.add(new int[] {x, y});
		}
		for(int i = 0; i < n; i++) {
			int[] start = point.get(i);
			for(int j = i + 1; j < n; j++) {
				int[] last = point.get(j);
				double check = Math.sqrt(Math.pow(last[0] - start[0], 2) + Math.pow(last[1] - start[1], 2));
				if(check <= limit) {
					list[i + 1].add(new Node(j + 1, check));
					list[j + 1].add(new Node(i + 1, check));
				}
			}
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			for(Node check : list[i]) {
				if(check.from == j) {
					list[i].remove(check);
					break;
				}
			}
			for(Node check : list[j]) {
				if(check.from == i) {
					list[j].remove(check);
					break;
				}
			}
			list[i].add(new Node(j, 0));
			list[j].add(new Node(i, 0));
		}
		dijkstra(1);
		sb.append((int)Math.floor(dis[n] * 1000));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dijkstra(int i) {
		// TODO Auto-generated method stub
		dis = new double[n + 1];
		visit = new boolean[n + 1];
		Arrays.fill(dis, INF);
		dis[i] = 0;
		pq = new PriorityQueue<>();
		pq.offer(new Node(i, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(visit[cur.from]) continue;
			visit[cur.from] = true;
			for(Node next : list[cur.from]) {
				dis[next.from] = Math.min(dis[next.from], dis[cur.from] + next.dist);
				pq.offer(new Node(next.from, dis[next.from]));
			}
		}
	}

}
