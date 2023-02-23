
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main {
	public static class Node implements Comparable<Node> {
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

	static int n;
	static int m;
	static int[] parent;
	static PriorityQueue<Node> pq;
	static int[] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		c = new int[n + 1];
		pq = new PriorityQueue<>();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			pq.offer(new Node(x, y, d));
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n + 1; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
				
		for(int i = 1; i < n + 1; i++) {
			pq.offer(new Node(i, 0, c[i]));
			pq.offer(new Node(0, i, c[i]));
		}
		
		long sum = 0;
		while (!pq.isEmpty()) {
			Node cur = pq.poll();
			if (!find(cur.t, cur.f)) {			
				sum += cur.d;
				unionParent(cur.t, cur.f);
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
