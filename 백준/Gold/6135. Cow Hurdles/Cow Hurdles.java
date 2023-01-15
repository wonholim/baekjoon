

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] c;
	static int INF = 100000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t1 = Integer.parseInt(st.nextToken());
		int t2 = Integer.parseInt(st.nextToken());
		c = new int[n + 1][n + 1];
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				if(i != j) {
					c[i][j] = INF;
				}
			}
		}
		while(t1 --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			c[x][y] = d;
		}
		for(int k = 1; k < n + 1; k++) {
			for(int i = 1; i < n + 1; i++) {
				for(int j = 1; j < n + 1; j++) {
					if(c[i][k] != INF) {
						if(c[i][j] > Math.max(c[i][k], c[k][j])) {
							c[i][j] = Math.max(c[i][k], c[k][j]);
						}
					}
				}
			}
		}
		while(t2 --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(c[x][y] >= INF) sb.append("-1\n");
			else sb.append(c[x][y] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
