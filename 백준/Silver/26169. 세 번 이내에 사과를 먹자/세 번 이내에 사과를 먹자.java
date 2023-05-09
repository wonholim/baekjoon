
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		c = new int[5][5];
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		if(c[x][y] == 1) {
			c[x][y] = 0;
			dfs(x, y, 1, 0);
		}
		else dfs(x, y, 0, 0);
		sb.append(count < 2 ? 0 : 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int x, int y, int a, int d) {
		// TODO Auto-generated method stub
		if(d == 3) {
			count = Math.max(count, a);
			return;
		}
		for(int k = 0; k < 4; k++) {
			int i = x + dx[k];
			int j = y + dy[k];
			if(i >= 0 && j >= 0 && i < 5 && j < 5) {
				if(c[i][j] != -1) {
					c[x][y] = -1;
					if(c[i][j] == 1) {
						c[i][j] = 0;
						dfs(i, j, a + 1, d + 1);
						c[i][j] = 1;
					}
					else {
						dfs(i, j, a, d + 1);
					} 
					c[x][y] = 0;
				}
			}
		}
	}

}
