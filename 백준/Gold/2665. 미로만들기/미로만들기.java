

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static boolean[][][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> q;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = new char[n][n];
		d = new boolean[(n * n) + 1][n][n];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		if(c[0][0] == '0') {
			d[0][0][0] = true;
			d[1][0][0] = true;
			q.offer(new int[] {0, 0, 1});
		}else {
			d[0][0][0] = true;
			q.offer(new int[] {0, 0, 0});
		}
		int min = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == n - 1 && g[1] == n - 1) {
				min = Math.min(min, g[2]);
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < n) {
					if(g[2] + 1 < n * n + 1) {
						if(c[i][j] == '1') {
							if(!d[g[2]][i][j]) {
								d[g[2]][i][j] = true;
								q.offer(new int[] {i, j, g[2]});
							}
						}else {
							if(!d[g[2] + 1][i][j]) {
								d[g[2] + 1][i][j] = true;
								q.offer(new int[] {i, j, g[2] + 1});
							}
						}
					}
				}
			}
		}
		sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
