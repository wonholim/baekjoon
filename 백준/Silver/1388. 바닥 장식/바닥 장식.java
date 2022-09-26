import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int count = 0;
	static int[][] b;
	static boolean[][] c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		b = new int[a][d];
		c = new boolean[a][d];
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < d; j++) {
				if(g.charAt(j) == '-') {
					b[i][j] = 1; 
				}
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < d; j++) {
				if(b[i][j] == 1 && !c[i][j]) {
					dfs(i, j);
					count++;
				}
			}
		}
		c = new boolean[a][d];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < d; j++) {
				if(b[i][j] == 0 && !c[i][j]) {
					dfs1(i, j);
					count++;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs1(int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || i >= b.length) return;
		if(b[i][j] == 1 || c[i][j]) return;
		if(b[i][j] == 0 && !c[i][j]) c[i][j] = true;
		
		dfs1(i + 1, j);
		dfs1(i - 1, j);
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(j < 0 || j >= b[i].length) return;
		if(b[i][j] == 0 || c[i][j]) return;
		if(b[i][j] == 1 && !c[i][j]) c[i][j] = true;
		
		dfs(i, j + 1);
		dfs(i, j - 1);
	}
}
