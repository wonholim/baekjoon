

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static boolean[] d;
	static int n;
	static int t;
	static Queue<Integer> q;
	static ArrayList<Integer>[] list;
	static ArrayList<Integer> boss;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		parent = new int[n];
		d = new boolean[n];
		list = new ArrayList[n];
		q = new ArrayDeque<>();
		boss = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = st.nextToken().charAt(0) - 'A';
			int j = st.nextToken().charAt(0) - 'A';
			list[i].add(j);
			parent[j]++;
		}
		for(int i = 0; i < n; i++) {
			if(parent[i] == 0) boss.add(i);
		}
		st = new StringTokenizer(br.readLine());
		t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			int i = st.nextToken().charAt(0) - 'A';
			list[i].clear();
			if(!boss.contains(i)) {
				for(int k = 0; k < list.length; k++) {
					list[k].remove(Integer.valueOf(i));
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(parent[i] == 0) {
				d[i] = true;
				q.offer(i);
			}
		}
		int count = 0;
		while(!q.isEmpty()) {
			int k = q.poll();
			for(int i : list[k]) {
				if(!d[i]) {
					count++;
					d[i] = true;
					q.offer(i);
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}	
}
