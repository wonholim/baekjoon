import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[][] c;
	static int[][] d;
	static int count;
	static int g = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new boolean[a][b];
		d = new int[a][b];
		int k = 0, l = 0;
		for(int i = 0 ; i < a; i++) {
			String e = br.readLine();
			for(int j = 0; j < b; j++) {
				if(e.charAt(j) == 'O') {
					d[i][j] = 1;
				}else if(e.charAt(j) == 'P') {
					d[i][j] = 2;
				}else if(e.charAt(j) == 'I') {
					d[i][j] = 1;
					k = i;
					l = j;
				}
			}
		}
		dfs(k, l);
		if(count > 0) {
			sb.append(count);
		}else {
			sb.append("TT");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
			if(i < 0 || j < 0 || i >= d.length || j >= d[0].length) return;
			if(d[i][j] == 0 || c[i][j]) return;
			if(d[i][j] == 2 && !c[i][j]) { c[i][j] = true; count++; }
			if(d[i][j] == 1 && !c[i][j]) { c[i][j] = true; }
			dfs(i + 1, j);
			dfs(i, j + 1);
			dfs(i - 1, j);
			dfs(i, j - 1);
	}
}
