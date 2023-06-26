
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] c;
	static boolean[][] d;
	static int w;
	static int sum;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		c = new int[n][m];
		d = new boolean[n][m];
		for(int i = 0; i < m; i++) {
			int k = Integer.parseInt(st.nextToken());
			for(int j = n - 1; j >= n - k; j--) {
				c[j][i] = 1;
			}
		}
		sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(c[i][j] == 1 || d[i][j]) continue;
				w = 0;
				count = 0;
				dfs(i, j);
				if(w == 2) sum += count;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || i >= n || j < 0 || j >= m || d[i][j]) return;
		if(c[i][j] == 1) {w++; return;}
		count++;
		d[i][j] = true;
		dfs(i, j + 1);
		dfs(i, j - 1);
	}

}
