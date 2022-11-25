

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
	static ArrayList<Node> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int turn = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Node(x, y, i));
		}
		while(turn --> 0) {
			parent = new int[n + 1];
			for(int i = 1; i < n + 1; i++) {
				parent[i] = i;
			}
			pq = new PriorityQueue<>();
			for(int i = 0; i < list.size(); i++) {
				pq.offer(list.get(i));
			}
			int ti = pq.size();
			int sum = 0;
			int count = 1;
			while(ti --> 0) {
				Node n = pq.poll();
				if(!find(n.t, n.f)) {
					sum += n.d;
					count++;
					unionParent(n.t, n.f);
				}
			}
			if(count == n) sb.append(sum + " ");
			else sb.append(0 + " ");
			if(!list.isEmpty()) list.remove(0);
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
