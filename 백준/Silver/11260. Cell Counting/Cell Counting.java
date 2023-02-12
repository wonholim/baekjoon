

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	static int[] dx = { 1, 1, -1, -1, 1, -1, 0, 0 };
	static int[] dy = { 1, -1, 1, -1, 0, 0, 1, -1 };
	static char[][] c;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			if (n == 0 && m == 0) break;
			c = new char[n][m];
			int count = 0;
			for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
			for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) if(c[i][j] == '#') if(dfs(i, j)) count++;
			sb.append(count + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 8; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) if(c[q][w] == '#') return false;
		}
		return true;
	}
}
