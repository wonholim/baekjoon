

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static boolean[][] d;
	static int max;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int a;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		a = Integer.parseInt(br.readLine());
		c = new int[a][a];
		d = new boolean[a][a];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < a; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		max = 1;
		for(int k = 1; k <= 100; k++) {
			int count = 0;
			d = new boolean[a][a];
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < a; j++) {
					if(!d[i][j] && c[i][j] > k) {
						d[i][j] = true;
						dfs(i, j, k);
						count++;
					}
				}
			}
			max = Math.max(max, count);
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j, int k) {
		// TODO Auto-generated method stub
		for(int q = 0; q < 4; q++) {
			int w = i + dx[q];
			int e = j + dy[q];
			if(w >= 0 && e >= 0 && w < a && e < a) {
				if(!d[w][e] && c[w][e] > k) {
					d[w][e] = true;
					dfs(w, e, k);
				}
			}
		}
	}

}
