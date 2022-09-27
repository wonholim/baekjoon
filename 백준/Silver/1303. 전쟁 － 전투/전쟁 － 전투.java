import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] c;
	static int[][] d;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new boolean[b][a];
		d = new int[b][a];
		for(int i = 0; i < b; i++) {
			String e = br.readLine();
			for(int j = 0; j < a; j++) {
				if(e.charAt(j) == 'W') {
					d[i][j] = 1;
				}
			}
		}
		int black = 0;
		int white = 0;
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				if(d[i][j] == 1 && !c[i][j]) {
					count = 0;
					dfs(i, j);
					white += Math.pow(count, 2);
				}
			}
		}
		c = new boolean[b][a];
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				if(d[i][j] == 0 && !c[i][j]) {
					count = 0;
					dfs1(i, j);
					black += Math.pow(count, 2);
				}
			}
		}
		
		sb.append(white + " " + black);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs1(int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || j < 0 || i >= d.length || j >= d[0].length) return;
		if(d[i][j] == 1 || c[i][j]) return;
		if(d[i][j] == 0 && !c[i][j]) { c[i][j] = true; count++; }
		dfs1(i + 1, j);
		dfs1(i, j + 1);
		dfs1(i - 1, j);
		dfs1(i, j - 1);
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || j < 0 || i >= d.length || j >= d[0].length) return;
		if(d[i][j] == 0 || c[i][j]) return;
		if(d[i][j] == 1 && !c[i][j]) { c[i][j] = true; count++; }
		dfs(i + 1, j);
		dfs(i, j + 1);
		dfs(i - 1, j);
		dfs(i, j - 1);
	}

}
