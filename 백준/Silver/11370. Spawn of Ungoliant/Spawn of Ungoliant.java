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
		while(true) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			if(d == 0 && e == 0) break;
			b = new int[e][d];
			c = new boolean[e][d];
			count = 0;
			int k = 0, h = 0;
			for(int i = 0; i < e; i++) {
				String g = br.readLine();
				for(int j = 0; j < d; j++) {
					if(g.charAt(j) != '.') {
						b[i][j] = 1;
					}
					if(g.charAt(j) == 'S') {
						k = i;
						h = j;
					}
				}
			}
			dfs(k, h);
			for(int i = 0; i < e; i++) {
				for(int j = 0; j < d; j++) {
					if(c[i][j] && b[i][j] == 1) sb.append("S");
					else if(!c[i][j] && b[i][j] == 1) sb.append("T");
					else sb.append(".");
				}
				sb.append("\n");
			}
		}
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
		dfs(i + 1, j);
		dfs(i - 1, j);
		dfs(i, j + 1);
		dfs(i, j - 1);
	}
}
