

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	static int[][] c;
	static int[][] d;
	static boolean[][] v;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		c = new int[n][n];
		d = new int[n][n];
		v = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				d[i][j] = c[i][j];
			}
		}
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i != j && j != k && i != k) {
						if(c[i][j] > c[i][k] + c[k][j]) {
							System.out.println(-1);
							return;
						}else if(c[i][j] == c[i][k] + c[k][j]){
							d[i][j] = -1;
						}
					}
				}
			}
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j && !v[i][j] && d[i][j] != -1) {
					count += c[i][j];
					v[i][j] = true;
					v[j][i] = true;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
