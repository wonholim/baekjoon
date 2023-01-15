

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static class Node implements Comparable<Node> {
		int t;
		int f;
		double d;

		public Node(int t, int f, double d) {
			this.t = t;
			this.f = f;
			this.d = d;
		}

		public int compareTo(Node o) {
			if(this.d > o.d) return -1;
			else if(this.d == o.d) return 0;
			else return 1;
		}

	}

	static PriorityQueue<Node> pq;
	static int[] parent;
	static int n;
	static ArrayList<int[]> list;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		pq = new PriorityQueue<>();
		double max = 0;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new int[] {x, y});
		}
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			double d = Math.sqrt(Math.pow(list.get(x - 1)[0] - list.get(y - 1)[0], 2) + Math.pow(list.get(x - 1)[1] - list.get(y - 1)[1], 2));
			max += d;
			pq.offer(new Node(x, y, d));
		}
		double sum = 0;
		while (!pq.isEmpty()) {
			Node n = pq.poll();
			if (!find(n.t, n.f)) {
				sum += n.d;
				unionParent(n.t, n.f);
			}
		}
		sb.append(String.format("%.3f", max - sum));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if (x > y)
			parent[y] = x;
		else
			parent[x] = y;
	}

	private static boolean find(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}

	private static int getParent(int x) {
		// TODO Auto-generated method stub
		if (parent[x] == x)
			return x;
		return parent[x] = getParent(parent[x]);
	}

}
