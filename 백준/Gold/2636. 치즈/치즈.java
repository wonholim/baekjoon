

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int a;
	static int b;
	static int[][] c;
	static boolean[][] d;
	static int count;
	static Queue<int[]> q;
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
		count = 0;
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0);
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(d[i][j]) {
					q.offer(new int[] {i, j});
				}
			}
		}
		int check = 0;
		while(true) {
			if(isMelt()) break;
			else count++;
			
			check = counting();
			while(!q.isEmpty()) {
				int[] t = q.poll();
				for(int k = 0; k < 4; k++) {
					int i = t[0] + dx[k];
					int j = t[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(c[i][j] == 1) {
							c[i][j] = 0;
						}
					}
				}
			}
			d = new boolean[a][b];
			dfs(0, 0);
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < b; j++) {
					if(d[i][j]) {
						q.offer(new int[] {i, j});
					}
				}
			}
		}
		sb.append(count + "\n" + check);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int counting() {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(c[i][j] == 1) {
					count++;
				}
			}
		}
		return count;
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		d[i][j] = true;
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < a && w < b) {
				if(!d[q][w]) {
					if(c[q][w] == 0) {
						d[q][w] = true;
						dfs(q, w);
					}
				}
			}
		}
	}
	private static boolean isMelt() {
		// TODO Auto-generated method stub
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(c[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
}
