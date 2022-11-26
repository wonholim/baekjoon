

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
	static int[][] c;
	static ArrayList<String> list = new ArrayList<>();
	static ArrayList<String> out = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int sum = 0;
		c = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		pq = new PriorityQueue<>();
		for(int i = 1; i <= n; i++) {
			for(int j = i + 1; j <= n; j++) {
					if(c[i][j] >= 0) {
						pq.offer(new Node(i, j, c[i][j]));
					}else {
						pq.offer(new Node(i, j, 0));
						sum += Math.abs(c[i][j]);
						list.add(i + " " + j);
					}
			}
		}
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		int ti = pq.size();
		while (ti-- > 0) {
			Node n = pq.poll();
			if (!find(n.t, n.f)) {
				sum += Math.abs(n.d);
				unionParent(n.t, n.f);
				if(!list.contains(n.t + " " + n.f)) {
					out.add(n.t + " " + n.f);
				}
			}
		}
		sb.append(sum + " " + out.size() + "\n");
		for(String k : out) {
			sb.append(k + "\n");
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
