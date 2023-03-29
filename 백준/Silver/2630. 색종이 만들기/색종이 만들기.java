

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] c;
	static int a = 0;
	static int b = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		c = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
			}
		}
		paper(0, 0, n);
		sb.append(a + "\n" + b);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void paper(int i, int j, int n) {
		// TODO Auto-generated method stub
		if(!c[i][j]) {
			boolean check = true;
			OUT:
			for(int x = i; x < i + n; x++) {
				for(int y = j; y < j + n; y++) {
					if(c[x][y]) {
						check = false;
						break OUT;
					}
				}
			}
			if(check) {a++; return;}
		}else {
			boolean check = true;
			OUT:
			for(int x = i; x < i + n; x++) {
				for(int y = j; y < j + n; y++) {
					if(!c[x][y]) {
						check = false;
						break OUT;
					}
				}
			}
			if(check) {b++; return;}
		}
		int k = n / 2;
		paper(i, j, k);
		paper(i + k, j, k);
		paper(i, j + k, k);
		paper(i + k, j + k, k);
	}
}
