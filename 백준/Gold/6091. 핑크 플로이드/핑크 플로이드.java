

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
	public static class Node implements Comparable<Node>{
		int t;
		int f;
		long d;
		public Node(int t, int f, long d) {
			this.t = t;
			this.f = f;
			this.d = d;
		}
		public int compareTo(Node o) {
			if(this.d > o.d) return 1;
			else if(this.d == o.d) return 0;
			else return -1;
		}
		
	}
	static PriorityQueue<Node> pq;
	static int[] parent;
	static int n;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		pq = new PriorityQueue<>();
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = i + 1; j <= n; j++) {
				long k = Long.parseLong(st.nextToken());
				pq.offer(new Node(i, j, k));
			}
		}
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		while (!pq.isEmpty()) {
			Node n = pq.poll();
			if (!find(n.t, n.f)) {
				list[n.t].add(n.f);
				list[n.f].add(n.t);
				unionParent(n.t, n.f);
			}
		}
		for(int i = 1; i <= n; i++) {
			Collections.sort(list[i]);
		}
		for(int i = 1; i <= n; i++) {
			sb.append(list[i].size() + " ");
			for(int k : list[i]) {
				sb.append(k + " ");
			}
			sb.append("\n");
		}
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

