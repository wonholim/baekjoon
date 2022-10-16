

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[][] c;
	static boolean[][] d;
	static int[] last;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		c = new int[5][5];
		d = new boolean[5][5];
		last = new int[2];
		q = new ArrayDeque<>();
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				if(c[i][j] == 1) {
					last[0] = i;
					last[1] = j;
				}
			}
		}
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		q.offer(new int[] {a, b, 0});
		d[a][b] = true;
		c[a][b] = 0;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < 5 && j < 5) {
					if(!d[i][j] && c[i][j] != -1) {
						d[i][j] = true;
						c[i][j] = g[2] + 1;
						q.offer(new int[] {i, j, c[i][j]});
					}
				}
			}
		}
		if(d[last[0]][last[1]]) sb.append(c[last[0]][last[1]] + "\n");
		else sb.append("-1\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
