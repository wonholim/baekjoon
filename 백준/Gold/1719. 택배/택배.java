

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
	static int INF = 100000000;
	static int[] dis;
	static boolean[] visit;
	static int[] checkPoint;
	static PriorityQueue<Node> pq;
	static int n;
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
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			list[x].add(new Node(y, dist));
			list[y].add(new Node(x, dist));
		}
		for(int i = 1; i < n + 1; i++) {
			dikstra(i);
			for(int j = 1; j < n + 1; j++) {
				if(i != j) sb.append(dfs(i, j) + " ");
				else sb.append("- ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(checkPoint[j] == i) {
			return j;
		}
		return dfs(i, checkPoint[j]);
	}
	private static void dikstra(int i) {
		// TODO Auto-generated method stub
		dis = new int[n + 1];
		visit = new boolean[n + 1];
		checkPoint = new int[n + 1];
		pq = new PriorityQueue<>();
		Arrays.fill(dis, INF);
		dis[i] = 0;
		pq.add(new Node(i, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();	
			if(visit[cur.from]) continue;
			else visit[cur.from] = true;
			for(Node next : list[cur.from]) {
				if(dis[next.from] > dis[cur.from] + next.dist) {
					dis[next.from] = dis[cur.from] + next.dist;
					checkPoint[next.from] = cur.from;
					pq.offer(new Node(next.from, dis[next.from]));
				}
			}
		}
	}

}
