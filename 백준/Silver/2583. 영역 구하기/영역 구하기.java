import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[][] c;
	static int[][] d;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		c = new boolean[a][b];
		d = new int[a][b];
		while(e --> 0) {
			int[] g = new int[4];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 4; i++) {
				g[i] = Integer.parseInt(st.nextToken());
			}
			for(int i = g[1]; i < g[3]; i++) {
				for(int j = g[0]; j < g[2]; j++) {
					d[i][j] = 1;
				}
			}
		}
		for(int i = 0 ; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(!c[i][j] && d[i][j] == 0) {
					dfs(i, j);
					list.add(count);
					count = 0;
				}
			}
		}
		Collections.sort(list);
		sb.append(list.size() + "\n");
		for(int i : list) {
			sb.append(i + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
			if(i < 0 || j < 0 || i >= d.length || j >= d[0].length) return;
			if(d[i][j] == 1 || c[i][j]) return;
			if(d[i][j] == 0 && !c[i][j]) { c[i][j] = true; count++;}
			dfs(i + 1, j);
			dfs(i, j + 1);
			dfs(i - 1, j);
			dfs(i, j - 1);
	}
}
