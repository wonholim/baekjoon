

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
	static boolean[] d;
	static int[] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		d = new boolean[100001];
		c = new int[100001];
		d[a] = true;
		q.offer(new int[] {a, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			int i = g[0];
			if(i * 2 <= 100000 && !d[i * 2]) {
				d[i * 2] = true;
				c[i * 2] = g[1];
				q.offer(new int[] {i * 2, g[1]});
			}
			if(i - 1 >= 0 && !d[i - 1]) {
				d[i - 1] = true;
				c[i - 1] = g[1] + 1;
				q.offer(new int[] {i - 1, g[1] + 1});
			}
			if(i + 1 <= 100000 && !d[i + 1]) {
				d[i + 1] = true;
				c[i + 1] = g[1] + 1;
				q.offer(new int[] {i + 1, g[1] + 1});
			}
		}
		sb.append(c[b]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
