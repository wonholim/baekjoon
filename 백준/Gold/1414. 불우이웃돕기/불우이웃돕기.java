

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
	static int[][] c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = new int[n][n];
		pq = new PriorityQueue<>();
		int all = 0;
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			for(int j = 0; j < n; j++) {
				if(line.charAt(j) == '0') continue;
				if(line.charAt(j) >= 'A' && line.charAt(j) <= 'Z') {
					c[i][j] = (line.charAt(j) - 'A' + 27);
				}else {
					c[i][j] = (line.charAt(j) - 'a' + 1);
				}
				all += c[i][j];
				if(i != j) {pq.offer(new Node(i, j, c[i][j]));}
				
			}
		}
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		int cnt = 0;
		int sum = 0;
		while (!pq.isEmpty()) {
			Node n = pq.poll();
			if (!find(n.t, n.f)) {
				sum += n.d;
				cnt++;
				unionParent(n.t, n.f);
			}
		}
		if(cnt == n - 1) sb.append((all - sum) + "\n");
		else sb.append(-1);
		
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
