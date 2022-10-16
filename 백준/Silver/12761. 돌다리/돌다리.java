

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
	static boolean[] dd;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		dd = new boolean[100001];
		q.offer(new int[] {c, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == d) {
				sb.append(g[1]);
				break;
			}
			if(g[0] >= 0 && g[0] <= 100000 && !dd[g[0]]) {
				dd[g[0]] = true;
				q.offer(new int[] {g[0] + 1, g[1] + 1});
				q.offer(new int[] {g[0] - 1, g[1] + 1});
				q.offer(new int[] {g[0] + a, g[1] + 1});
				q.offer(new int[] {g[0] - a, g[1] + 1});
				q.offer(new int[] {g[0] * a, g[1] + 1});
				q.offer(new int[] {g[0] * b, g[1] + 1});
				q.offer(new int[] {g[0] + b, g[1] + 1});
				q.offer(new int[] {g[0] - b, g[1] + 1});
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
