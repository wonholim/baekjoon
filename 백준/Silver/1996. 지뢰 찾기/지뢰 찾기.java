

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static int[] dx = {1, 1, -1, -1, 1, 0, -1, 0};
	static int[] dy = {1, -1, -1, 1, 0, 1, 0, -1};
	static int t;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		t = Integer.parseInt(br.readLine());
		c = new int[t][t];
		for(int i = 0; i < t; i++) {
			String g = br.readLine();
			for(int j = 0; j < t; j++) {
				if(g.charAt(j) != '.') {
					c[i][j] = -1;
					dfs(i, j, g.charAt(j) - '0');
				}
			}
		}
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				if(c[i][j] == -1) {
					sb.append("*");
				}else if(c[i][j] > 9){
					sb.append("M");
				}else {
					sb.append(c[i][j]);
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j, int k) {
		// TODO Auto-generated method stub
		for(int q = 0; q < 8; q++) {
			int w = i + dx[q];
			int e = j + dy[q];
			if(w >= 0 && e >= 0 && w < t && e < t) {
				if(c[w][e] != -1) {
					c[w][e] += k;
				}
			}
		}
	}

}
