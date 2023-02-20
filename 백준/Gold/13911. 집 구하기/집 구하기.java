

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
		int y;
		long d;
		public Node(int y, long d) {
			this.y = y;
			this.d = d;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			if(this.d > o.d) return 1;
			else if(this.d < o.d) return -1;
			return 0;
		}
	}
	static int n;
	static ArrayList<Node>[] list;
	static int INF = 1_000_000_000;
	static long[] distM;
	static long[] distS;
	static boolean[] v;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		distM = new long[n + 1];
		distS = new long[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
			distM[i] = INF;
			distS[i] = INF;
		}
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			list[x].add(new Node(y, d));
			list[y].add(new Node(x, d));
		}
		st = new StringTokenizer(br.readLine());
		int mac = Integer.parseInt(st.nextToken());
		int macD = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		pq = new PriorityQueue<>();
		v = new boolean[n + 1];
		while(mac --> 0) {
			int start = Integer.parseInt(st.nextToken());
			pq.offer(new Node(start, 0));
			distM[start] = 0;
		}
		dijkstraM();
		st = new StringTokenizer(br.readLine());
		int star = Integer.parseInt(st.nextToken());
		int starD = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		pq = new PriorityQueue<>();
		v = new boolean[n + 1];
		while(star --> 0) {
			int start = Integer.parseInt(st.nextToken());
			pq.offer(new Node(start, 0));
			distS[start] = 0;
		}
		dijkstraS();
		long min = INF;
		for(int i = 1; i < n + 1; i++) {
			if(distM[i] > macD || distS[i] > starD) continue;
			if(distM[i] == 0 || distS[i] == 0) continue;
			min = Math.min(min, distM[i] + distS[i]);
		}
		if(min == INF) sb.append(-1);
		else sb.append(min);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dijkstraS() {
		// TODO Auto-generated method stub
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if (v[cur.y]) continue;
			else v[cur.y] = true;
			for (Node next : list[cur.y]) {
				if (distS[next.y] > distS[cur.y] + next.d) {
					distS[next.y] = distS[cur.y] + next.d;
					pq.offer(new Node(next.y, distS[next.y]));
				}
			}
		}
	}
	private static void dijkstraM() {
		// TODO Auto-generated method stub
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if (v[cur.y]) continue;
			else v[cur.y] = true;
			for (Node next : list[cur.y]) {
				if (distM[next.y] > distM[cur.y] + next.d) {
					distM[next.y] = distM[cur.y] + next.d;
					pq.offer(new Node(next.y, distM[next.y]));
				}
			}
		}
	}

}
