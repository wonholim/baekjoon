

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
	static Queue<Integer> q;
	static int[] c;
	static int[] sum;
	static int[] last;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int test = Integer.parseInt(br.readLine());
		while(test --> 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			list = new ArrayList[n + 1];
			for(int i = 1; i < n + 1; i++) list[i] = new ArrayList<>();
			c = new int[n + 1];
			sum = new int[n + 1];
			last = new int[n + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i < n + 1; i++) {
				sum[i] = Integer.parseInt(st.nextToken());
				last[i] = sum[i];
			}
			while(t --> 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				list[x].add(y);
				c[y]++;
			}
			q = new ArrayDeque<>();
			for(int i = 1; i < n + 1; i++) {
				if(c[i] == 0) {
					q.offer(i);
					c[i]++;
				}
			}
			while(!q.isEmpty()) {
				int k = q.poll();
				for(int g : list[k]) {
					last[g] = Math.max(last[g], sum[g] + last[k]);
					c[g]--;
					if(c[g] == 0) {
						q.offer(g);
					}
				}
			}
			sb.append(last[Integer.parseInt(br.readLine())] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
