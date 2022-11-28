

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	static class Node implements Comparable<Node>{
		int f;
		int t;
		int d;
		public Node(int f, int t, int d) {
			this.f = f;
			this.t = t;
			this.d = d;
		}
		public int compareTo(Node o) {
			return this.d - o.d;
		}
	}
	static int n;
	static int[] parent;
	static PriorityQueue<Node> pq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int cycle = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		parent = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		while(cycle --> 0) {
			int k = Integer.parseInt(st.nextToken());
			parent[k] = 0;
		}
		pq = new PriorityQueue<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			pq.offer(new Node(x, y, d));
		}
		int sum = 0;
		while(!pq.isEmpty()) {
			Node c = pq.poll();
			if(!find(c.f, c.t)) {		
				sum += c.d;
				unionParent(c.f, c.t);
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
		if (x > y) parent[y] = x;
		else parent[x] = y;
	}

	private static boolean find(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}

	private static int getParent(int x) {
		// TODO Auto-generated method stub
		if (parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
}
