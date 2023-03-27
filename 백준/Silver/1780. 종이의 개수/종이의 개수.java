

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] c;
	static int a = 0;
	static int b = 0;
	static int d = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		paper(0, 0, n);
		sb.append(d + "\n" + b + "\n" + a);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void paper(int i, int j, int n) {
		// TODO Auto-generated method stub
		if(c[i][j] == 1) {
			boolean check = false;
			OUT:
			for(int x = i; x < i + n; x++) {
				for(int y = j; y < j + n; y++) {
					if(c[x][y] != 1) {
						check = true;
						break OUT;
					}
				}
			}
			if(!check) { a++; return;}
		}else if(c[i][j] == 0) {
			boolean check = false;
			OUT:
			for(int x = i; x < i + n; x++) {
				for(int y = j; y < j + n; y++) {
					if(c[x][y] != 0) {
						check = true;
						break OUT;
					}
				}
			}
			if(!check) { b++; return; }
		}else {
			boolean check = false;
			OUT:
			for(int x = i; x < i + n; x++) {
				for(int y = j; y < j + n; y++) {
					if(c[x][y] != -1) {
						check = true;
						break OUT;
					}
				}
			}
			if(!check) { d++; return; }
		}
		int k = n / 3;
		paper(i, j, k);
		paper(i + k, j, k);
		paper(i + 2 * k, j, k);
		paper(i, j + k, k);
		paper(i, j + 2 * k, k);
		paper(i + k, j + k, k);
		paper(i + 2 * k, j + k, k);
		paper(i + k, j + 2 * k, k);
		paper(i + 2 * k, j + 2 * k, k);
	}

}
