

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
	public static class Indexing implements Comparable<Indexing>{
		int g;
		int index;
		public Indexing(int g, int index) {
			this.g = g;
			this.index = index;
		}
		@Override
		public int compareTo(Indexing o) {
			// TODO Auto-generated method stub
			return this.g - o.g;
		}
	}
	static PriorityQueue<Node> pq;
	static int[] parent;
	static int n;
	static ArrayList<Indexing> x1 = new ArrayList<>();
	static ArrayList<Indexing> y1 = new ArrayList<>();
	static ArrayList<Indexing> z1 = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		parent = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			x1.add(new Indexing(x, i + 1));
			y1.add(new Indexing(y, i + 1));
			z1.add(new Indexing(z, i + 1));
		}
		Collections.sort(x1);
		Collections.sort(y1);
		Collections.sort(z1);
		int j = 0;
		for(int i = 0; i < n - 1; i++) {
			j = i + 1;
				pq.offer(new Node(x1.get(i).index, x1.get(j).index, Math.abs(x1.get(i).g - x1.get(j).g)));
				pq.offer(new Node(y1.get(i).index, y1.get(j).index, Math.abs(y1.get(i).g - y1.get(j).g)));
				pq.offer(new Node(z1.get(i).index, z1.get(j).index, Math.abs(z1.get(i).g - z1.get(j).g)));

		}
		long sum = 0;
		while(!pq.isEmpty()) {
			Node n = pq.poll();
			if(!find(n.t, n.f)) {
				sum += n.d;
				unionParent(n.t, n.f);
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
