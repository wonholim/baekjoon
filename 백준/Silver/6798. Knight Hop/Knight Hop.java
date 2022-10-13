

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
	static int[][] c;
	static boolean[][] d;
	static int b;
	static int[] last;
	static int[] start;
	static Queue<int[]> qq;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		qq = new ArrayDeque<>();
		b = 8;
		c = new int[b][b];
		d = new boolean[b][b];
		last = new int[2];
		start = new int[2];
		st = new StringTokenizer(br.readLine());
		start[0] = Integer.parseInt(st.nextToken()) - 1;
		start[1] = Integer.parseInt(st.nextToken()) - 1;
		qq.offer(new int[] {start[0], start[1], 0});
		st = new StringTokenizer(br.readLine());
		last[0] = Integer.parseInt(st.nextToken()) - 1;
		last[1] = Integer.parseInt(st.nextToken()) - 1;
		if(start[0] == last[0] && start[1] == last[1]) {
			sb.append(0 + "\n");
		}else {
			sb.append(bfs() + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int bfs() {
		// TODO Auto-generated method stub
		while(!qq.isEmpty()) {
			int[] g = qq.poll();
			for(int k = 0; k < 8; k++) {
				int e = g[0] + dx[k];
				int q = g[1] + dy[k];
				if(e >= 0 && q >= 0 && e < b && q < b && !d[e][q]) {
					if(e == last[0] && q == last[1]) {
						return g[2] + 1;
					}else {
						d[e][q] = true;
						qq.offer(new int[] {e, q, g[2] + 1});
					}
				}
			}
		}
		return 0;
	}

}
