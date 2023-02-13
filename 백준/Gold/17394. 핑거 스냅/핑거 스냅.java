

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] c;
	static Queue<int[]> q;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		c = new boolean[1000001];
		for(int i = 2; i <= 1000000; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j <= 1000000; j = i + j) {
				c[j] = true;
			}
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a <= n && n <= b && !c[n]) {
				sb.append("0\n");
				continue;
			}
			q = new ArrayDeque<>();
			d = new boolean[2000001];
			q.offer(new int[] {n, 0});
			boolean check = false;
			while(!q.isEmpty()) {
				int[] g = q.poll();
				if(a <= g[0] && g[0] <= b && !c[g[0]]) {
					sb.append(g[1] + "\n");
					check = true;
					break;
				}
				if(!d[g[0] / 2]) {
					d[g[0] / 2] = true;
					q.offer(new int[] {g[0] / 2, g[1] + 1});
				}
				if(!d[g[0] / 3]) {
					d[g[0] / 3] = true;
					q.offer(new int[] {g[0] / 3, g[1] + 1});
				}
				if(g[0] + 1 < 2000001&& !d[g[0] + 1]) {
					d[g[0] + 1] = true;
					q.offer(new int[] {g[0] + 1, g[1] + 1});
				}
				if(g[0] - 1 >= 0&& !d[g[0] - 1]) {
					d[g[0] - 1] = true;
					q.offer(new int[] {g[0] - 1, g[1] + 1});
				}
			}
			if(!check) sb.append("-1\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
