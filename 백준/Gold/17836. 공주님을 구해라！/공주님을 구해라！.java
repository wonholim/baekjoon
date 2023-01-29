

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] c;
	static boolean[][] d;
	static int t;
	static Queue<int[]> q;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int min = 1_000_000_000;
	static int[] sword;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		c = new int[n][m];
		d = new boolean[n][m];
		sword = new int[3];
		Arrays.fill(sword, -1);
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		firstSearch();
		if(sword[0] != -1) {
			min = Math.min(min, (n - sword[0] - 1) + (m - sword[1] - 1) + sword[2]);
		}
		if(min > t) sb.append("Fail");
		else sb.append(min);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void firstSearch() {
		// TODO Auto-generated method stub
		q.offer(new int[] {0, 0, 0});
		d[0][0] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == n - 1 && g[1] == m - 1) min = Math.min(min, g[2]);
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < m) {
					if(!d[i][j] && c[i][j] != 1) {
						d[i][j] = true;
						if(c[i][j] == 2) {
							sword[0] = i;
							sword[1] = j;
							sword[2] = g[2] + 1;
						}else {
							q.offer(new int[] {i, j, g[2] + 1});
						}
					}
				}
			}
		}
	}
}
