
import java.io.*;
import java.util.*;

public class Main {
	static class Node {
		long n;
		int d;
		public Node(long n, int d) {
			this.n = n;
			this.d = d;
		}
	}

	static Map<Long, Integer> m;
	static Queue<Node> q;
	static int k;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		m = new HashMap<>();
		q = new ArrayDeque<>();
		q.offer(new Node(n, 0));
		m.put(n, 0);
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.n == 1) {
				System.out.println(cur.d);
				return;
			}
			if(cur.n % 3 == 0 && m.get(cur.n / 3) == null) {
				m.put(cur.n / 3, 0);
				q.offer(new Node(cur.n / 3, cur.d + 1));
			}
			if(cur.n % 2 == 0 && m.get(cur.n / 2) == null) {
				m.put(cur.n / 2, 0);
				q.offer(new Node(cur.n / 2, cur.d + 1));
			}
			if(cur.n - 1 > 0 && m.get(cur.n - 1) == null) {
				m.put(cur.n - 1, 0);
				q.offer(new Node(cur.n - 1, cur.d + 1));
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
