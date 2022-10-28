

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
	static int[][] c;
	static boolean[][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Deque<int[]> q;
	static int a;
	static int b;
	static int x;
	static int y;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		q = new ArrayDeque<>();
		for(int i = 0; i < a; i++){
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				if(g.charAt(j) == 'S') {
					d[i][j] = true;
					q.offer(new int[] {i, j, 0});
				}else if(g.charAt(j) == '*') {
					d[i][j] = true;
					c[i][j] = -1;
					q.offerFirst(new int[] {i, j, -1});
				}else if(g.charAt(j) == 'D') {
					x = i;
					y = j;
				}else if(g.charAt(j) == 'X') {
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
							if(!(i == x && j == y)) {
								d[i][j] = true;
								c[i][j] = -1;
								q.offer(new int[] {i, j, -1});
							}
						}else if(c[i][j] != -1){
							d[i][j] = true;
							c[i][j] = g[2] + 1;
							q.offer(new int[] {i, j, c[i][j]});
						}
					}
				}
			}
		}
		if(d[x][y]) {
			sb.append(c[x][y]);
		}else {
			sb.append("KAKTUS");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
