
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
		int to;
		int cost;
		public Node(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}
		
	}
	static ArrayList<Node>[] list;
	static PriorityQueue<Node> pq;
	static int[] dis;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		list = new ArrayList[a + 1];
		for(int i = 1; i <= a; i++) {
			list[i] = new ArrayList<>();
		}
		dis = new int[a + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(new Node(y, 1));
		}
		pq = new PriorityQueue<>();
		dis[d] = 0;
		pq.offer(new Node(d, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			int to = cur.to;
			int cost = cur.cost;
			if(cost > c) continue;
			for(Node next : list[to]) {
				if(dis[next.to] > next.cost + cost) {
					dis[next.to] = next.cost + cost;
					pq.offer(new Node(next.to, next.cost + cost));
				}
			}
		}
		boolean check = false;
		for(int i = 1; i <= a; i++) {
			if(dis[i] == c) {
				sb.append(i + "\n");
				check = true;
			}
		}
		if(!check) sb.append(-1);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
