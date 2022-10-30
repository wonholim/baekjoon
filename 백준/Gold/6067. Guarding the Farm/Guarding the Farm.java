import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int[][] c;
	static boolean[][] d;
	static int count;
	static boolean check;
	static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		count = 0;
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(c[i][j] != 0 && !d[i][j]) {
					check = true;
					dfs(i, j);
					if(check) count++;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		d[i][j] = true;
		for(int k = 0; k < 8; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < a && w < b) {
				if(c[q][w] != 0) {
					if(c[q][w] > c[i][j]) check = false;
					if(!d[q][w] && c[q][w] == c[i][j]) {
						dfs(q, w);
					}
				}
			}
		}
	}

}
