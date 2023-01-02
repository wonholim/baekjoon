

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
	static int n;
	static ArrayList<Integer>[] list;
	static boolean[] v;
	static int[] c;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		q = new ArrayDeque<>();
		c = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i < k; i++) {
			q.offer(Integer.parseInt(br.readLine()));
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
		}
		while(!q.isEmpty()) {
			v = new boolean[n + 1];
			int g = q.poll();
			v[g] = true;
			c[g]++;
			dfs(g);
		}
		int count = 0;
		for(int i = 1; i < n + 1; i++) {
			if(c[i] == k) count++;
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int g) {
		// TODO Auto-generated method stub
		for(int next : list[g]) {
			if(!v[next]) {
				v[next] = true;
				c[next]++;
				dfs(next);
			}
		}
	}

}
