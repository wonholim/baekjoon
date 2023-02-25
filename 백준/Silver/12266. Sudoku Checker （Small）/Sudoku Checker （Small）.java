

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= t; i++) {
			boolean check = false;
			int n = Integer.parseInt(br.readLine());
			c = new int[(n * n) + 1][(n * n) + 1];
			for(int j = 1; j < (n * n) + 1; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 1; k < (n * n) + 1; k++) {
					c[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			outer : for(int j = 1; j < (n * n) + 1; j++) {
				d = new boolean[(n * n) + 1];
				for(int k = 1; k < (n * n) + 1; k++) {
					if(c[j][k] > 0 && c[j][k] < 10) d[c[j][k]] = true;
				}
				for(int k = 1; k < (n * n) + 1; k++) {
					if(!d[k]) {
						check = true;
						break outer;
					}
				}
			}
			if(check) {
				sb.append("Case #" + i + ": No\n");
				continue;
			}
			outer : for(int j = 1; j < (n * n) + 1; j++) {
				d = new boolean[(n * n) + 1];
				for(int k = 1; k < (n * n) + 1; k++) {
					if(c[k][j] > 0 && c[k][j] < 10) d[c[k][j]] = true;
				}
				for(int k = 1; k < (n * n) + 1; k++) {
					if(!d[k]) {
						check = true;
						break outer;
					}
				}
			}
			if(check) {
				sb.append("Case #" + i + ": No\n");
				continue;
			}
			int x = 1;
			int y = 1;
			outer : for(int q = 0; q < 9; q++) {
					d = new boolean[(n * n) + 1];
					for(int j = x; j < x + 3; j++) {
						for(int k = y; k < y + 3; k++) {
							if(c[j][k] > 0 && c[j][k] < 10) d[c[j][k]] = true;
						}
					}
					for(int j = 1; j < (n * n) + 1; j++) {
						if(!d[j]) {
							check = true;
							break outer;
						}
					}
					if(y != 7) y += 3;
					else {
						x += 3;
						y = 1;
					}
					if(x == 10) break;
			}
			if(check) {
				sb.append("Case #" + i + ": No\n");
				continue;
			}
			sb.append("Case #" + i + ": Yes\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
