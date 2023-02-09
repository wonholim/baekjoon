

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean[] visit;
	static int[] c;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		visit = new boolean[1000001];
		c = new int[1000001];
		visit[n] = true;
		c[n] = -1;
		q = new ArrayDeque<>();
		q.offer(new int[] {n, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == 1) {
				System.out.println(g[1]);
			}
			if(g[0] % 3 == 0 && !visit[g[0] / 3]) {
				q.offer(new int[] {g[0] / 3, g[1] + 1});
				visit[g[0] / 3] = true;
				c[g[0] / 3] = g[0];
			}
			if(g[0] % 2 == 0 && !visit[g[0] / 2]) {
				q.offer(new int[] {g[0] / 2, g[1] + 1});
				visit[g[0] / 2] = true;
				c[g[0] / 2] = g[0];
			}
			if(g[0] - 1 > 0 && !visit[g[0] - 1]) {
				q.offer(new int[] {g[0] - 1, g[1] + 1});
				visit[g[0] - 1] = true;
				c[g[0] - 1] = g[0];
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		int tmp = 1;
		while(tmp != n) {
			list.add(c[tmp]);
			tmp = c[tmp];
		}
		if(!list.isEmpty()) {
			Collections.sort(list, Collections.reverseOrder());
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i) + " ");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
