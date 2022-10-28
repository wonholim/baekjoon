

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Deque<int[]> q;
	static boolean[][] d;
	static int[][] c;
	static int a;
	static int b;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			b = Integer.parseInt(st.nextToken());
			a = Integer.parseInt(st.nextToken());
			q = new ArrayDeque<>();
			c = new int[a][b];
			d = new boolean[a][b];
			for(int i = 0; i < a; i++) {
				String g = br.readLine();
				for(int j = 0; j < b; j++) {
					if(g.charAt(j) == '@') {
						d[i][j] = true;
						c[i][j] = 0;
						q.offer(new int[] {i, j, 0});
					}else if(g.charAt(j) == '*') {
						d[i][j] = true;
						c[i][j] = -2;
						q.offerFirst(new int[] {i, j, -1});
					}else if(g.charAt(j) == '#') {
						d[i][j] = true;
						c[i][j] = -2;
					}
				}
			}
			while(!q.isEmpty()) {
				int[] g = q.poll();
				for(int k = 0; k < 4; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(!d[i][j]) {
							if(g[2] == -1) {
								d[i][j] = true;
								c[i][j] = -2;
								q.offer(new int[] {i, j, -1});
							}else{
								d[i][j] = true;
								c[i][j] = g[2] + 1;
								q.offer(new int[] {i, j, c[i][j]});
							}
						}
					}
				}
			}
			int min = 999999999;
			for(int i = 0; i < b; i++) {if(d[0][i] && c[0][i] != -2) {min = Math.min(min, c[0][i]);}}
			for(int i = 0; i < b; i++) {if(d[a - 1][i] && c[a - 1][i] != -2) {min = Math.min(min, c[a - 1][i]);}}
			for(int i = 0; i < a; i++) {if(d[i][0] && c[i][0] != -2) {min = Math.min(min, c[i][0]);}}
			for(int i = 0; i < a; i++) {if(d[i][b - 1] && c[i][b - 1] != -2) {min = Math.min(min, c[i][b - 1]);}}
			if(min == 999999999) {
				sb.append("IMPOSSIBLE\n");
			}else {
				sb.append((min + 1) + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
