

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int t;
		int d;
		public Node(int t, int d) {
			this.t = t;
			this.d = d;
		}
	}
	static int n;
	static int m;
	static int start;
	static int last;
	static ArrayList<Node>[] list;
	static boolean[] d;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		last = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) list[i] = new ArrayList<>();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			list[x].add(new Node(y, d));
			list[y].add(new Node(x, d));
		}
		
		int l = 1, r = Integer.MAX_VALUE, ans = 0;
		while(l <= r) {
			int mid = (l + r) / 2;
			if(determination(mid)) {
				ans = mid;
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean determination(int mid) {
		// TODO Auto-generated method stub
		d = new boolean[n + 1];
		q = new ArrayDeque<>();
		q.offer(start);
		d[start] = true;
		while(!q.isEmpty()) {
			int g = q.poll();
			if(g == last) {
				return true;
			}
			for(Node k : list[g]) {
				if(!d[k.t] && mid <= k.d) {
					d[k.t] = true;
					q.offer(k.t);
				}
			}
		}
		return false;
	}

}
