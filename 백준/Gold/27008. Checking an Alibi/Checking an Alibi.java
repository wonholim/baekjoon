
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	static class Node implements Comparable<Node>{
		int f;
		int d;
		public Node(int f, int d) {
			this.f = f;
			this.d = d;
		}
		public int compareTo(Node o) {
			return this.d - o.d;
		}
	}
	static int n;
	static int m;
	static ArrayList<Node>[] list;
	static int[] dis;
	static boolean[] visited;
	static int INF = Integer.MAX_VALUE;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int t2 = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		dis = new int[n + 1];
		list = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		pq = new PriorityQueue<>();
		for(int i = 1; i < n + 1; i++) {
			dis[i] = INF;
			list[i] = new ArrayList<>();
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			list[x].add(new Node(y, d));
			list[y].add(new Node(x, d));
		}
		dis[1] = 0;

		pq.offer(new Node(1, dis[1]));
		while(!pq.isEmpty()) {
			Node c = pq.poll();
			if(visited[c.f]) continue;
			visited[c.f] = true;
			for(Node next : list[c.f]) {
				if(dis[next.f] > dis[c.f] + next.d) {
					dis[next.f] = dis[c.f] + next.d;
					pq.offer(new Node(next.f, dis[next.f]));
				}
			}
		}
		ArrayList<Integer> cows = new ArrayList<>();
		for(int i = 1; i <= t2; i++) {
			int index = Integer.parseInt(br.readLine());
			if(dis[index] <= m) {
				cows.add(i);
			}
		}
		Collections.sort(cows);
		sb.append(cows.size() + "\n");
		for(int k : cows) {
			sb.append(k + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
