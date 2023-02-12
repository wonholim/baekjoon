

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
	static int n;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static char[][] map;
	static boolean[][] d;
	static int tmp;
	static int length;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		map = new char[n][n];
		d = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			map[i] = br.readLine().toCharArray();
		}
		int f = 0;
		int s = 0;
		int count = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!d[i][j] && map[i][j] != '.') {
					d[i][j] = true;
					tmp = 1;
					length = 0;
					dfs(i, j);
					if (f < tmp) {
						f = tmp;
						s = length;
					} else if (f == tmp) {
						s = Math.min(s, length);
					}
				}
			}
		}
		sb.append(f + " " + s);
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
			if(q >= 0 && w >= 0 && q < n && w < n) {
				if(!d[q][w] && map[q][w] != '.') {
					d[q][w] = true;
					tmp++;
					dfs(q, w);
				}else if(!d[q][w] && map[q][w] == '.') {
					length++;
				}
			}else {
				length++;
			}
		}
	}

}
