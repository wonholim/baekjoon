

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		String out;
		long g;
		public Node(String out, long g) {
			this.out = out;
			this.g = g;
		}
	}
	static boolean[] d;
	static Queue<Node> q;
	static Set<Long> s = new HashSet<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		if(a == b) {System.out.println(0); return;}
		q = new ArrayDeque<>();
		q.offer(new Node("", a));
		while(!q.isEmpty()) {
			Node n = q.poll();
			if(n.g == b) {System.out.println(n.out); return;}
			if(n.g * n.g <= b && !s.contains(n.g * n.g)) {
				s.add(n.g * n.g);
				q.offer(new Node(n.out + "*", n.g * n.g));
			}
			if(n.g + n.g <= b && !s.contains(n.g + n.g)) {
				s.add(n.g + n.g);
				q.offer(new Node(n.out + "+", n.g + n.g));
			}
			if(n.g - n.g <= b && !s.contains(n.g - n.g)) {
				s.add(n.g - n.g);
				q.offer(new Node(n.out + "-", n.g - n.g));
			}
			if(n.g != 0 && n.g / n.g <= b && !s.contains(n.g / n.g)) {
				s.add(n.g / n.g);
				q.offer(new Node(n.out + "/", n.g / n.g));
			}
		}
		sb.append(-1);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
