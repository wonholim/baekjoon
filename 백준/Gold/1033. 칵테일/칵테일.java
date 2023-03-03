

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int x;
		int y;
		int z;
		public Node(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	static ArrayList<Node>[] list;
	static long lcm;
	static long[] m;
	static boolean[] d;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		d = new boolean[n];
		m = new long[n];
		lcm = 1;
		for(int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			list[a].add(new Node(b, c, d));
			list[b].add(new Node(a, d, c));
			lcm = lcm * ((c * d) / gcd(c, d));
		}
		m[0] = lcm;
		
		dfs(0);
		long tmp = m[0];
		for(int i = 1; i < n; i++) {
			tmp = gcd(tmp, m[i]);
		}
		for(int i = 0; i < n; i++) {
			sb.append(m[i] / tmp + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i) {
		// TODO Auto-generated method stub
		d[i] = true;
		for(Node check : list[i]) {
			if(!d[check.x]) {
				m[check.x] = (m[i] * check.z) / check.y;
				dfs(check.x);
			}
		}
	}
	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(a % b == 0) return b;
		return gcd(b, a % b);
	}

}
