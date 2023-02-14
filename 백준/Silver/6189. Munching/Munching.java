
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] c = new char[n][m];
		Queue<int[]> q = new ArrayDeque<>();
		boolean[][] d = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String g = br.readLine();
			for(int j = 0; j < m; j++) {
				c[i][j] = g.charAt(j);
				if(c[i][j] == 'C') {
					d[i][j] = true;
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == 0 && g[1] == 0) {
				sb.append(g[2]);
				break;
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < m) {
					if(!d[i][j] && c[i][j] != '*') {
						d[i][j] = true;
						q.offer(new int[] {i, j, g[2] + 1});
					}
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
