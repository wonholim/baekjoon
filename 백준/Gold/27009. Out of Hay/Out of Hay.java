

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
		int to;
		int from;
		int dis;
		public Node(int to, int from, int dis) {
			this.to = to;
			this.from = from;
			this.dis = dis;
		}
		public int compareTo(Node o) {
			return this.dis - o.dis;
		}
	}
	static int n;
	static PriorityQueue<Node> pq;
	static int[] parent;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		pq = new PriorityQueue<>();
		parent = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dis = Integer.parseInt(st.nextToken());
			pq.offer(new Node(x, y, dis));
			pq.offer(new Node(y, x, dis));
		}
		int sum = 0;
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(!find(cur.to, cur.from)) {
				sum = Math.max(sum, cur.dis);
				unionParent(cur.to, cur.from);
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if(x < y) parent[y] = x;
		else parent[x] = y;
	}
	public static boolean find(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}
	private static int getParent(int x) {
		// TODO Auto-generated method stub
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
}
