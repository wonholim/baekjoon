

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Time{
		int x;
		int y;
		public Time(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int n;
	static int m;
	static char[][] c;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int s1 = 0;
	static int s2 = 0;
	static int l1 = 0;
	static int l2 = 0;
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
		s1 = 0;
		s2 = 0;
		l1 = 0;
		l2 = 0;
		boolean check = false;
		for (int j = 0; j < m; j++) {
			if (!check && c[0][j] == '.') {
				check = true;
				s1 = 0;
				s2 = j;
			} else if (check && c[0][j] == '.') {
				l1 = 0;
				l2 = j;
			}
		}
		for (int j = 0; j < n; j++) {
			if (!check && c[j][0] == '.') {
				check = true;
				s1 = j;
				s2 = 0;
			} else if (check && c[j][0] == '.') {
				l1 = j;
				l2 = 0;
			}
		}
		for (int j = 0; j < m; j++) {
			if (!check && c[n - 1][j] == '.') {
				check = true;
				s1 = n - 1;
				s2 = j;
			} else if (check && c[n - 1][j] == '.') {
				l1 = n - 1;
				l2 = j;
			}
		}
		for (int j = 0; j < n; j++) {
			if (!check && c[j][m - 1] == '.') {
				check = true;
				s1 = j;
				s2 = m - 1;
			} else if (check && c[j][m - 1] == '.') {
				l1 = j;
				l2 = m - 1;
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(c[i][j] == '.') c[i][j] = '@';
			}
		}
		c[s1][s2] = '.';
		dfs(s1, s2);
		for(int i = 0; i < n; i++) {
			sb.append(c[i]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean dfs(int x, int y) {
		// TODO Auto-generated method stub
		if(x == l1 && y == l2) {
			return true;
		}
		for(int k = 0; k < 4; k++) {
			int i = x + dx[k];
			int j = y + dy[k];
			if(i >= 0 && j >= 0 && i < n && j < m) {
				if(c[i][j] == '@') {
					c[i][j] = '.';
					if(dfs(i, j)) return true;
					c[i][j] = '@';
				}
			}
		}
		return false;
	}

}
