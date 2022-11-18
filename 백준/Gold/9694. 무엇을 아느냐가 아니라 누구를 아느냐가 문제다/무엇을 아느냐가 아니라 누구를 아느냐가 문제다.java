

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
	static ArrayList<Node>[] list;
	static int n;
	static int[] dis;
	static int INF = 1000000000;
	static int[] back;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int count = 1;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int t2 = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			list = new ArrayList[n];
			for(int i = 0; i < n; i++) {
				list[i] = new ArrayList<>();
			}
			while(t2 --> 0) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int dist = Integer.parseInt(st.nextToken());
				list[i].add(new Node(j, dist));
				list[j].add(new Node(i, dist));
			}
			dijkstra(0);
			sb.append("Case #" + count + ": ");
			if(dis[n - 1] == INF) {
				sb.append("-1\n");
			}else {
				sb.append("0 ");
				ArrayList<Integer> r = new ArrayList<>();
				int k = n - 1;
				while(k != 0) {
					r.add(k);
					k = back[k];
				}
				for(int i = r.size() - 1; 0 <= i; i--) {
					sb.append(r.get(i) + " ");
				}
				sb.append("\n");
			}
			count++;
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dijkstra(int i) {
		// TODO Auto-generated method stub
		dis = new int[n];
		back = new int[n];
		pq = new PriorityQueue<>();
		Arrays.fill(dis, INF);
		dis[i] = 0;
		pq.offer(new Node(i, 0));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(cur.dist > dis[cur.from]) continue;
			for(Node next : list[cur.from]) {
				if(dis[next.from] > dis[cur.from] + next.dist) {
					dis[next.from] = dis[cur.from] + next.dist;
					back[next.from] = cur.from;
					pq.offer(new Node(next.from, dis[next.from]));
				}
			}
		}
	}

}
