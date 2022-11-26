

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
	static ArrayList<Integer> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			if(n == 0 && t == 0) break;
			pq = new PriorityQueue<>();
			while(t --> 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				pq.offer(new Node(x, y, d));
			}
			parent = new int[n + 1];
			for (int i = 1; i < n + 1; i++) {
				parent[i] = i;
			}
			int ti = pq.size();
			while (ti-- > 0) {
				Node n = pq.poll();
				if (!find(n.t, n.f)) {
					list.add(n.d);
					unionParent(n.t, n.f);
				}
			}
			sb.append(list.get((n - 1) / 2)  + "\n");
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
