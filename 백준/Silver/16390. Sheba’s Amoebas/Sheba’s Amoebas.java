import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] b;
	static boolean[][] c;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			b = new int[d][e];
			c = new boolean[d][e];
			count = 0;
			for(int i = 0; i < d; i++) {
				String g = br.readLine();
				for(int j = 0; j < e; j++) {
					if(g.charAt(j) != '.') {
						b[i][j] = 1;
					}
				}
			}
			for(int i = 0; i < d; i++) {
				for(int j = 0; j < e; j++) {
					if(b[i][j] == 1 && !c[i][j]) {
						dfs(i, j);
						count++;
					}
				}
			}
			sb.append(count + "\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || j < 0 || i >= b.length || j >= b[0].length) return;
		if(b[i][j] == 0 || c[i][j]) return;
		if(b[i][j] == 1 && !c[i][j]) c[i][j] = true;
		dfs(i + 1, j + 1);
		dfs(i - 1, j - 1);
		dfs(i - 1, j + 1);
		dfs(i + 1, j - 1);		
		dfs(i + 1, j);
		dfs(i - 1, j);
		dfs(i, j + 1);
		dfs(i, j - 1);
	}

}