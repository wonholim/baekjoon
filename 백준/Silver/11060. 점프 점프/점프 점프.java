

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> q;
	static int[] c;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		q = new ArrayDeque<>();
		c = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		d = new boolean[n];
		d[0] = true;
		q.offer(new int[] {0, c[0], 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == n - 1) {
				System.out.println(g[2]);
				return;
			}else {
				for(int i = 1; i <= g[1]; i++) {
					int w = g[0] + i;
					if(w >= 0 && w < n) {
						if(!d[w]) {
							d[w] = true;
							q.offer(new int[] {w,  c[w], g[2] + 1});
						}
					}
				}
			}
		}
		sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
