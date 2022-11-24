

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
			if(this.d > o.d) return 1;
			else if(this.d == o.d) return 0;
			return -1;
		}
	}

	static int n;
	static int[] parent;
	static PriorityQueue<Node> MST;
	static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		MST = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new int[] {x, y});
		}
		for(int i = 0; i < n; i++) {
			int[] start = list.get(i);
			for(int j = i + 1; j < n; j++) {
				int[] last = list.get(j);
				double d = Math.sqrt(Math.pow(last[0] - start[0], 2) + Math.pow(last[1] - start[1], 2));
				MST.offer(new Node(i + 1, j + 1, d));
			}
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			MST.offer(new Node(x, y, 0));
		}
		int t2 = MST.size();
		double sum = 0;
		while (t2-- > 0) {
			Node cur = MST.poll();
			if (!find(cur.t, cur.f)) {
				sum += cur.d;
				unionParent(cur.t, cur.f);
			}
		}
		sb.append(String.format("%.2f", sum));
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
