

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int x;
	static int y;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static char[][] c;
	static boolean[][] d;
	static int max;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		c = new char[x][y];
		d = new boolean[x][y];
		for(int i = 0; i < x; i++) {
			String line = br.readLine();
			for(int j = 0; j < y; j++) {
				c[i][j] = line.charAt(j);
			}
		}
		max = 0;
		for(int i = 0 ; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(c[i][j] == '*' && !d[i][j]) {
					count = 1;
					d[i][j] = true;
					dfs(i, j);
					max = Math.max(max, count);
				}
				
			}
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < x && w < y) {
				if(!d[q][w] && c[q][w] == '*') {
					count++;
					d[q][w] = true;
					dfs(q, w);
				}
			}
		}
	}

}
