

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int sheep;
	static int wolf;
	static int a;
	static int b;
	static int ss;
	static int ww;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static char[][] c;
	static boolean[][] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new char[a][b];
		d = new boolean[a][b];
		sheep = 0;
		wolf = 0;
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				c[i][j] = g.charAt(j);
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if((c[i][j] == 'v' || c[i][j] == 'o') && !d[i][j]) {
					ss = 0;
					ww = 0;
					if(c[i][j] == 'v') {
						ww++;
					}else if(c[i][j] == 'o') {
						ss++;
					}
					d[i][j] = true;
					dfs(i, j);
					if(ww < ss) {
						sheep += ss;
					}else {
						wolf += ww;
					}
				}
			}
		}
		sb.append(sheep + " " + wolf);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < a && w < b) {
				if(!d[q][w] && c[q][w] != '#') {
					d[q][w] = true;
					if(c[q][w] == 'v') {
						ww++;
					}else if(c[q][w] == 'o') {
						ss++;
					}
					dfs(q, w);
				}
			}
		}
	}
}
