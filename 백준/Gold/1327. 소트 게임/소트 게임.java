import java.io.*;
import java.util.*;

public class Main {
	static class Node {String line; int depth; public Node(String line, int depth) {this.line = line; this.depth = depth;}}
	static Map<String, Boolean> m = new HashMap<>();
	static Queue<Node> q = new ArrayDeque<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String[] tmp = br.readLine().split(" ");
		String f = "";
		for (String g : tmp) f += g;
		q.offer(new Node(f, 0));
		while (!q.isEmpty()) {
			Node cur = q.poll();
			char[] c = cur.line.toCharArray();
			if (isSorted(c)) {
				System.out.println(cur.depth);
				return;
			}
			isMaked(n, k, cur.line, cur.depth);
		}
		System.out.println(-1);
	}
	private static void isMaked(int n, int k, String line, int depth) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= n - k; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < i; j++) {
				sb.append(line.charAt(j));
			}
			for (int j = i + k - 1; j >= i; j--) {
				sb.append(line.charAt(j));
			}
			for (int j = i + k; j < n; j++) {
				sb.append(line.charAt(j));
			}
			String next = sb.toString();
			if (m.get(next) == null) {
				m.put(next, true);
				q.offer(new Node(next, depth + 1));
			}
		}
	}
	private static boolean isSorted(char[] c) {
		// TODO Auto-generated method stub
		int i = 1;
		for (char g : c) if(g - '0' != i++) return false;
		return true;
	}

}
