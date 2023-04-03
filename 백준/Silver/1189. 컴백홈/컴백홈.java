
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 한수는 1부터시작한다;;
	static int n;
	static int m;
	static int k;
	static char[][] c;
	static boolean[][] d;
	static int count = 0;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		d = new boolean[n][m];
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		count = 0;
		d[n - 1][0] = true;
		dfs(n - 1, 0, 1);
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j, int l) {
		// TODO Auto-generated method stub
		if(l > k) return;
		if(l == k && i == 0 && j == m - 1 ) {
			count++;
			return;
		}
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(c[q][w] != 'T' && !d[q][w]) {
					d[q][w] = true;
					dfs(q, w, l + 1);
					d[q][w] = false;
				}
			}
		}
	}

}
