

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static char[][] d;
	static int[][] e;
	static int n;
	static int[] dx = {1, 1, -1, -1, 1, -1, 0, 0};
	static int[] dy = {1, -1, -1, 1, 0, 0, 1, -1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		c = new char[n][n];
		d = new char[n][n];
		e = new int[n][n];
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			for(int j = 0; j < n; j++) {
				c[i][j] = line.charAt(j);
			}
		}
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			for(int j = 0; j < n; j++) {
				d[i][j] = line.charAt(j);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(c[i][j] == '*') {
					dfs(i, j);
				}
			}
		}
		boolean check = false;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(c[i][j] == '*' && d[i][j] == 'x') {
					check = true;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(check) {
					if(d[i][j] == 'x' && c[i][j] != '*') {
						sb.append(e[i][j]);
					}else if(c[i][j] == '*'){
						sb.append("*");
					}else {
						sb.append('.');
					}
				}else {
					if(d[i][j] == 'x') {
						sb.append(e[i][j]);
					}else {
						sb.append(".");
					}
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 8; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < n) {
				if(d[q][w] == 'x') {
					e[q][w]++;
				}
			}
		}
	}

}
