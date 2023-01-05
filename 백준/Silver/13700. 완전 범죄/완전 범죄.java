

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] c;
	static boolean[] d;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int dx = Integer.parseInt(st.nextToken());
		int xd = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		c = new int[n + 1];
		d = new boolean[n + 1];
		q = new ArrayDeque<>();
		q.offer(new int[] {s, 0});
		d[s] = true;
		if(k != 0) st = new StringTokenizer(br.readLine());
		while(k --> 0) {
			int p = Integer.parseInt(st.nextToken());
			c[p] = -1;
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == l) {
				System.out.print(g[1]);
				return;
			}
			int i = g[0] + dx;
			int j = g[0] - xd;
			if(i <= n && !d[i] && c[i] != -1) {
				d[i] = true;
				c[i] = g[1] + 1;
				q.offer(new int[] {i, g[1] + 1});
			}
			if(j > 0 && !d[j] && c[j] != -1) {
				d[j] = true;
				c[j] = g[1] + 1;
				q.offer(new int[] {j, g[1] + 1});
			}
		}
		sb.append("BUG FOUND");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
