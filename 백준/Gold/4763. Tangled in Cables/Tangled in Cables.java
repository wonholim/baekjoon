

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main {
	public static class Node implements Comparable<Node>{
		int t;
		int f;
		double d;
		public Node(int t, int f, double d) {
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
	static ArrayList<Node> list = new ArrayList<>();
	static Map<String, Integer> m = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		double max = Double.parseDouble(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++) {
			String k = br.readLine();
			m.put(k, i);
		}
		parent = new int[t + 1];
		for(int i = 1; i < t + 1; i++) {
			parent[i] = i;
		}
		pq = new PriorityQueue<>();
		int turn = Integer.parseInt(br.readLine());
		while(turn --> 0) {
			st = new StringTokenizer(br.readLine());
			String x = st.nextToken();
			String y = st.nextToken();
			double d = Double.parseDouble(st.nextToken());
			pq.offer(new Node(m.get(x), m.get(y), d));
		}
		double sum = 0;
		while (!pq.isEmpty()) {
			Node n = pq.poll();
			if (!find(n.t, n.f)) {
				sum += n.d;
				unionParent(n.t, n.f);
			}
		}
		if(sum > max) {
			sb.append("Not enough cable");
		}else {
			sb.append("Need " + String.format("%.1f", sum) + " miles of cable");
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
