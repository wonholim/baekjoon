

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[][] c;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(x == 0 && y == 0) break;
			c = new int[x + 1][y + 1];
			for(int i = 1; i <= x; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j <= y; j++) {
					c[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int len = 0;
			if(x == 1 || y == 1) {
				for(int i = 1; i <= x; i++) {
					for(int j = 1; j <= y; j++) {
						len = Math.max(len, c[i][j]);
					}
				}
			}else {	
				for(int i = 1; i <= x; i++) {
					for(int j = 1; j <= y; j++) {
						if(c[i][j] == 1) {
							c[i][j] = Math.min(Math.min(c[i - 1][j], c[i][j - 1]), c[i - 1][j - 1]) + 1;
							len = Math.max(len, c[i][j]);
						}
					}
				}
			}
			sb.append(len + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
