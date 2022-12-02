

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Node implements Comparable<Node>{
		int x;
		int y;
		double d;
		public Node(int x, int y, double d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
		public int compareTo(Node o) {
			if(this.d > o.d) return 1;
			else if(this.d == o.d) return 0;
			else return -1;
		}
	}
	static ArrayList<int[]> point;
	static int n;
	static int m;
	static PriorityQueue<Node> pq;
	static int[] parent;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			 st = new StringTokenizer(br.readLine());
			 n = Integer.parseInt(st.nextToken());
			 m = Integer.parseInt(st.nextToken());
			 parent = new int[m + 1];
			 for(int i = 1; i < m + 1; i++) {
				 parent[i] = i;
			 }
			 point = new ArrayList<>();
			 pq = new PriorityQueue<>();
			 for(int i = 0; i < m; i++) {
				 st = new StringTokenizer(br.readLine());
				 int x = Integer.parseInt(st.nextToken());
				 int y = Integer.parseInt(st.nextToken());
				 point.add(new int[] {x, y});
			 }
			 for(int i = 0; i < point.size(); i++) {
				 for(int j = i + 1; j < point.size(); j++) {
					 double k = Math.sqrt(Math.pow(point.get(i)[0] - point.get(j)[0], 2) + Math.pow(point.get(i)[1] - point.get(j)[1], 2));
					 pq.offer(new Node(i + 1, j + 1, k));
				 }
			 }
			 double sum = 0;
			 int count = 0;
			 while(!pq.isEmpty()) {
				 Node c = pq.poll();
				 if(!find(c.x, c.y)) {
					 if(count == m - n) break;
					 sum = c.d;
					 count++;
					 unionParent(c.x, c.y);
				 }
			 }
			 sb.append(String.format("%.2f", sum) + "\n");
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
