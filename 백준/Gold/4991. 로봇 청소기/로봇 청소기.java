

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> searchQueue;
	static int[][] c;
	static int[][][] d;
	static int n;
	static int m;
	static int move;
	static int garbage;
	static int garbageAll;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			if(m == 0 && n == 0) break;
			c = new int[n][m];
			garbage = 0;
			searchQueue = new ArrayDeque<>();
			d = new int[n][m][2048];
			for(int i = 0; i < n; i++) {
				String k = br.readLine();
				for(int j = 0; j < m; j++) {
					if(k.charAt(j) == 'o') {
						searchQueue.offer(new int[] {i, j, 0});
					}else if(k.charAt(j) == '*') {
						garbage++;
						c[i][j] = garbage;
					}else if(k.charAt(j) == 'x') {
						c[i][j] = -1;
					}
				}
			}
			garbageAll =  (int)(Math.pow(2, garbage)) - 1;
			boolean check = false;
			while(!searchQueue.isEmpty()) {
				int[] g = searchQueue.poll();
				if(g[2] == garbageAll) {
					sb.append(d[g[0]][g[1]][g[2]] + "\n");
					check = true;
					break;
				}
				for(int k = 0; k < 4; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if( i >= 0 && j >= 0 && i < n && j < m) {
						if(c[i][j] != -1) {
							if(c[i][j] > 0) {
								if(d[i][j][g[2] | (int)(Math.pow(2, c[i][j] - 1))] == 0) {
									d[i][j][g[2] | (int)(Math.pow(2, c[i][j] - 1))] = d[g[0]][g[1]][g[2]] + 1;
									searchQueue.offer(new int[] {i, j, g[2] | (int)(Math.pow(2, c[i][j] - 1))});
								}
							}
							if(c[i][j] == 0) {
								if(d[i][j][g[2]] == 0) {
									d[i][j][g[2]] = d[g[0]][g[1]][g[2]] + 1;
									searchQueue.offer(new int[] {i, j, g[2]});
								}
							}
						}
					}
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
