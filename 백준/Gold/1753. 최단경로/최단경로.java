import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Node implements Comparable<Node>{
		int from;
		int dist;
		public Node(int from, int dis) {
			this.from = from;
			this.dist = dis;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dist - o.dist;
		}
		
	}
	static int a;
	static int b;
	static int start;
	static int INF = 1_000_000_000;
	static int[] dis;
	static boolean[] v;
	static ArrayList<Node>[] list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(br.readLine());
		list = new ArrayList[a + 1];
		dis = new int[a + 1];
		v = new boolean[a + 1];
		for(int i = 1; i <= a; i++) {
			dis[i] = INF;
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int di = Integer.parseInt(st.nextToken());
			list[e].add(new Node(g, di));
		}
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		dis[start] = 0;
		while(!pq.isEmpty()) {
			Node n = pq.poll();
			int cur = n.from;
			if(!v[cur]) {
				v[cur] = true;
				for(Node next : list[cur]) {
					if(dis[next.from] > dis[cur] + next.dist) {
						dis[next.from] = dis[cur] + next.dist;
						pq.add(new Node(next.from, dis[next.from]));
					}
				}
			}
		}
		for(int i = 1; i <= a; i++) {
			if(dis[i] == INF) sb.append("INF\n");
			else sb.append(dis[i] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
