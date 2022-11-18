
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
	static int[] dis;
	static boolean[] visit;
	static int INF = 2000000000;
	static PriorityQueue<Node> pq;
	static int n;
	static int y;
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
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		dijkstra2(x);
		int min = dis[z];
		if(min == INF) min = -1;
		dijkstra(x);
		int min2 = dis[y];
		if(min2 != INF) {
			dijkstra(y);
			min2 += dis[z];
			if(dis[z] == INF) min2 = -1;
		}else {
			min2 = -1;
		}
		sb.append(min2 + " " + min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dijkstra2(int x) {
		// TODO Auto-generated method stub
		dis = new int[n + 1];
		visit = new boolean[n + 1];
		Arrays.fill(dis, INF);
		pq = new PriorityQueue<>();
		pq.offer(new Node(x, 0));
		dis[x] = 0;
		visit[y] = true;
		while (!pq.isEmpty()) {
			Node cur = pq.poll();
			if (visit[cur.from]) continue;
			else visit[cur.from] = true;
			for (Node next : list[cur.from]) {
				if (dis[next.from] > dis[cur.from] + next.dist) {
					dis[next.from] = dis[cur.from] + next.dist;
					pq.offer(new Node(next.from, dis[next.from]));
				}
			}
		}
	}
	

	private static void dijkstra(int x) {
		// TODO Auto-generated method stub
		dis = new int[n + 1];
		visit = new boolean[n + 1];
		Arrays.fill(dis, INF);
		pq = new PriorityQueue<>();
		pq.offer(new Node(x, 0));
		dis[x] = 0;
		while (!pq.isEmpty()) {
			Node cur = pq.poll();
			if (visit[cur.from]) continue;
			else visit[cur.from] = true;
			for (Node next : list[cur.from]) {
				if (dis[next.from] > dis[cur.from] + next.dist) {
					dis[next.from] = dis[cur.from] + next.dist;
					pq.offer(new Node(next.from, dis[next.from]));
				}
			}
		}
	}
}
