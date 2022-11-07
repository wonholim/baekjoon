

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int t;
	static int[][] c;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int max = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		int x = 0;
		int y = 0;
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				if(g.charAt(j) == 'G') {
					x = i;
					y = j;
				}else if(g.charAt(j) == 'S'){
					c[i][j] = -1;
				}else if(g.charAt(j) == '#'){
					c[i][j] = -2;
				}
			}
		}
		dfs(x, y, 0, 0);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j, int count, int time) {
		// TODO Auto-generated method stub
		if(time == t) {
			max = Math.max(max, count); 
			return;
		}
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < a && w < b) {
				if(c[q][w] != -2) {
					if(c[q][w] == -1) {
						c[q][w] = 0;
						dfs(q,w, count + 1, time + 1);
						c[q][w] = -1;
					}else {
						dfs(q,w, count, time + 1);
					}
				}
			}
		}
	}

}
