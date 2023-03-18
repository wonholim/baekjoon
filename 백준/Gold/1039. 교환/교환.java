

import java.io.*;
import java.util.*;

public class Main {
	static class Node {
		String line;
		int number;
		int depth;
		char[] c;
		public Node(String line, int number, int depth, char[] c) {
			this.line = line;
			this.number = number;
			this.depth = depth;
			this.c = c;
		}
	}
	static char[] c;
	static Map<String, Integer> m;
	static Queue<Node> q;
	static int kang;
	static Set<String> s;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		c = st.nextToken().toCharArray();
		kang = Integer.parseInt(st.nextToken());
		m = new HashMap<>();
		q = new ArrayDeque<>();
		q.offer(new Node(String.valueOf(c), Integer.parseInt(String.valueOf(c)), 0, c));
		int max = 0;
		s = new HashSet<>();
		s.add(String.valueOf(c) + 0);
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n.c[0] == '0') continue;
			if(kang == n.depth) {
				max = Math.max(max, n.number);
				continue;
			}
			for(int i = 0; i < c.length; i++) {
				for(int j = i + 1; j < c.length; j++) {
					char[] tmp = new char[c.length];
					for(int k = 0; k < c.length; k++) {
						tmp[k] = n.c[k];
					}
					char tmpp = tmp[i];
					tmp[i] = tmp[j];
					tmp[j] = tmpp;
					if(s.contains(String.valueOf(tmp) + (n.depth + 1))) continue;
					s.add(String.valueOf(tmp) + (n.depth + 1));
					q.offer(new Node(String.valueOf(tmp), Integer.parseInt(String.valueOf(tmp)), n.depth + 1, tmp));
				}
			}
		}
		if(Integer.toString(max).length() == c.length && max != 0) sb.append(max);
		else sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}