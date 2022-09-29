import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[][] c;
	static boolean[][] d;
	static int target;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		for(int i = 0; i < a; i++) {
			String[] g = br.readLine().split("");
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(g[j]);
			}
		}
		st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		target = c[y][x];
		d[y][x] = true;
		dfs(y, x);
		int e = Integer.parseInt(st.nextToken());
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(d[i][j]) {
					sb.append(e);
				}else {
					sb.append(c[i][j]);
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int q, int w) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int e = q + dx[k];
			int s = w + dy[k];
			if(e >= 0 && s >= 0 && e < c.length && s < c[0].length) {
				if(c[e][s] == target && !d[e][s]) {
					d[e][s] = true;
					dfs(e, s);
				}
			}
		}
	}

}