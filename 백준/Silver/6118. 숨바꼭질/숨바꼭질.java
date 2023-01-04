

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
	static Queue<int[]> q;
	static int x;
	static int y;
	static ArrayList<Integer>[] list;
	static boolean[] d;
	static int count = 0;
	static int[] c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		c = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		d = new boolean[n + 1];
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			list[i].add(j);
			list[j].add(i);
		}
		q = new ArrayDeque<>();
		d[1] = true;
		q.offer(new int[] {1, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k : list[g[0]]) {
				if(!d[k]) {
					d[k] = true;
					c[k] = g[1] + 1;
					count = Math.max(count, g[1] + 1);
					q.offer(new int[] {k, g[1] + 1});
				}
			}
		}
		for(int i = 1; i < n + 1; i++) {
			if(c[i] == count) {
				sb.append(i + " " + c[i]);
				break;
			}
		}
		int cnt = 0;
		for(int i = 1; i < n + 1; i++) {
			if(c[i] == count) {
				cnt++;
			}
		}
		sb.append(" " + cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
