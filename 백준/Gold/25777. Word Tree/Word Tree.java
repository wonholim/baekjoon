

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
		int d;
		public Node(int t, int f, int d) {
			this.t = t;
			this.f = f;
			this.d = d;
		}
		public int compareTo(Node o) {
			return this.d - o.d;
		}
		
	}
	static PriorityQueue<Node> pq;
	static int[] parent;
	static int n;
	static ArrayList<String> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		pq = new PriorityQueue<>();
		for(int i = 1; i <= n; i++) {
			list.add(br.readLine());
		}
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int sum = 0;
				for(int k = 0; k < w; k++) {
					sum += Math.abs(list.get(i).charAt(k) - list.get(j).charAt(k));
				}
				pq.offer(new Node(i, j, sum));
			}
		}
		int count = 0;
		while (!pq.isEmpty()) {
			Node n = pq.poll();
			if (!find(n.t, n.f)) {
				count = Math.max(count, n.d);
				unionParent(n.t, n.f);
			}
		}
		sb.append(count);
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
