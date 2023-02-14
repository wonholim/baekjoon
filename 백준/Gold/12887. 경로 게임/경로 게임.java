

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
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		char[][] c = new char[2][n];
		q = new ArrayDeque<>();
		Map<String, String> m = new HashMap<>();
		boolean[][] d = new boolean[2][n];
		for(int i = 0; i < 2; i++) {
			c[i] = br.readLine().toCharArray();
			if(c[i][0] == '.') {
				d[i][0] = true;
				q.offer(new int[] {i, 0});
			}
		}
		int x = -1;
		int y = -1;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if((g[0] == 0 && g[1] == n - 1) || (g[0] == 1 && g[1] == n - 1)) {
				x = g[0];
				y = g[1];
				c[x][y] = '#';
				break;
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < 2 && j < n) {
					if(!d[i][j] && c[i][j] != '#') {
						d[i][j] = true;
						q.offer(new int[] {i, j});
						m.put(i + " " +j, g[0] + " " + g[1]);
					}
				}
			}
		}
		while(m.get(x + " " + y) != null) {
			String[] k = m.get(x + " " + y).split(" ");
			c[Integer.parseInt(k[0])][Integer.parseInt(k[1])] = '#';
			x = Integer.parseInt(k[0]);
			y = Integer.parseInt(k[1]);
		}
		int count = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				if(c[i][j] == '.') count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
