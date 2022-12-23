

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
	static int n;
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static Queue<int[]> qq = new ArrayDeque<>();
	static int[][] c;
	static boolean[][] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		c = new int[n][n];
		d = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			String g = br.readLine();
			for(int j = 0 ; j < n; j++) {
				if(g.charAt(j) == 'x') {
					c[i][j] = -1;
				}
			}
		}
		qq.offer(new int[] {0, 0});
		d[0][0] = true;
		while(!qq.isEmpty()) {
			int[] g = qq.poll();
			for(int k = 0; k < 2; k++) {
				int q = g[0] + dx[k];
				int w = g[1] + dy[k];
				if(q >= 0 && w >= 0 && q < n && w < n) {
					if(!d[q][w] && c[q][w] != -1) {
						d[q][w] = true;
						qq.offer(new int[] {q, w});
					}
				}
			}
		}
		if(d[n - 1][n - 1]) sb.append("Yes");
		else sb.append("No");	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
