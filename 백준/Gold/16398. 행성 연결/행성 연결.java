
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			else return - 1;
		}
		
	}
	static PriorityQueue<Node> pq;
	static int[] parent;
	static int n;
	static long[][] c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		c = new long[n + 1][n + 1];
		parent = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			parent[i] = i;
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n + 1; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		pq = new PriorityQueue<>();
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				if(i != j) {
					pq.offer(new Node(i, j, c[i][j]));
				}
			}
		}
		int t = pq.size();
		long sum = 0;
		while(t --> 0) {
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
