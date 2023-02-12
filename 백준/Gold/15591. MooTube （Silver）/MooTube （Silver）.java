

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int y, d;
		public Node(int y, int d) {
			this.y = y;
			this.d = d;
		}	
	}
	static int n;
	static boolean[] d;
	static ArrayList<Node>[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			list[x].add(new Node(y, d));
			list[y].add(new Node(x, d));
		}
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int count = 0;
			d = new boolean[n + 1];
			Queue<Integer> queue = new ArrayDeque<>();
			queue.add(x);
			d[x] = true;
			while(!queue.isEmpty()) {
				int ab = queue.poll();
				if(!d[ab]) continue;
				for(Node next : list[ab]) {
					if(!d[next.y]) {
						d[next.y] = true;
						if(next.d >= k) {
							count++;
							queue.offer(next.y);
						}
					}
				}
			}
			sb.append(count + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
