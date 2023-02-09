

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static int[] dx = {1, 1, -1, -1, 0, 0};
	static int[] dy_o = {1, 0, 1, 0, 1, -1};
	static int[] dy_e = {-1, 0, -1, 0, 1, -1};
	static int n;
	static int m;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		for(int i = 0; i < n; i++) {
			c[i] = br.readLine().toCharArray();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(c[i][j] == '.') continue;
				dfs(i, j);
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 6; k++) {
			int q = i + dx[k];
			int w = j;
			if(i % 2 == 0) w += dy_e[k];
			else w += dy_o[k];
			if(q >= n || w >= m || q < 0 || w < 0) continue;
			if(c[q][w] == '.') count++;
		}
	}

}
