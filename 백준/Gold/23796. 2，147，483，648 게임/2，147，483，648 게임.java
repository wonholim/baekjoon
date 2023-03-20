
import java.io.*;
import java.util.*;

public class Main {
	static long[][] c;
	static Queue<int[]> q;
	static boolean[][] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		c = new long[8][8];
		q = new ArrayDeque<>();
		d = new boolean[8][8];
		for(int i = 0; i < 8; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 8; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		String key = br.readLine();
		if(key.equals("U")) {
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(c[i][j] != 0) {
						q.offer(new int[] {i, j, -1, 0, 0});
					}
				}
			}
		}else if(key.equals("D")) {
			for(int i = 7; i >= 0; i--) {
				for(int j = 7; j >= 0; j--) {
					if(c[i][j] != 0) {
						q.offer(new int[] {i, j, 1, 0, 0});
					}
				}
			}
		}else if(key.equals("L")) {
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(c[j][i] != 0) {
						q.offer(new int[] {j, i, 0, -1, 0});
					}
				}
			}
		}else {
			for(int i = 7; i >= 0; i--) {
				for(int j = 7; j >= 0; j--) {
					if(c[j][i] != 0) {
						q.offer(new int[] {j, i, 0, 1, 0});
					}
				}
			}
		}
		move();
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				sb.append(c[i][j] + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void move() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			int[] g = q.poll();
			int i = g[0] + g[2];
			int j = g[1] + g[3];
			if(i >= 0 && j >= 0 && i < 8 && j < 8) {
				if(c[i][j] == 0) {
					c[i][j] = c[g[0]][g[1]];
					c[g[0]][g[1]] = 0;
					if(d[g[0]][g[1]]) {
						d[i][j] = true;
						d[g[0]][g[1]] = false;
					}
					q.offer(new int[] {i, j, g[2], g[3], g[4]});
				}else if(c[i][j] == c[g[0]][g[1]]){
					if(!d[i][j] && !d[g[0]][g[1]]) {
						d[i][j] = true;
						c[i][j] = 2 * c[i][j];
						c[g[0]][g[1]] = 0;
						q.offer(new int[] {i, j, g[2], g[3], g[4]});
					}
				}
			}
		}
	}
}
