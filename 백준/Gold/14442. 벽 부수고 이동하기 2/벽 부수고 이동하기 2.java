
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static boolean[][][] d;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		d = new boolean[w + 1][n][m];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		q.offer(new int[] {0, 0, 0, 1});
		for(int i = 0; i < w; i++) d[i][0][0] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == n - 1 && g[1] == m - 1) {
				System.out.println(g[3]);
				return;
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < m) {
					if(g[2] <= w && !d[g[2]][i][j]) {
						if(g[2] == 0 && c[i][j] == '0') {
							d[g[2]][i][j] = true;
							q.offer(new int[] {i, j, g[2], g[3] + 1});
						}else if(g[2] <= w && c[i][j] == '1') {
							d[g[2]][i][j] = true;
							q.offer(new int[] {i, j, g[2] + 1, g[3] + 1});
						}else if(g[2] <= w && c[i][j] == '0') {
							d[g[2]][i][j] = true;
							q.offer(new int[] {i, j, g[2], g[3] + 1});
						}
					}
				}
			}
		}
		sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
