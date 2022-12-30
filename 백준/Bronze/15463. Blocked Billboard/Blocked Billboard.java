

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		boolean[][] c = new boolean[2001][2001];
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()) + 1000;
			int y1 = Integer.parseInt(st.nextToken()) + 1000;
			int x2 = Integer.parseInt(st.nextToken()) + 1000;
			int y2 = Integer.parseInt(st.nextToken()) + 1000;
			for(int j = x1; j < x2; j++) {
				for(int k = y1; k < y2; k++) {
					c[j][k] = true; 
				}
			}
		}
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken()) + 1000;
		int y1 = Integer.parseInt(st.nextToken()) + 1000;
		int x2 = Integer.parseInt(st.nextToken()) + 1000;
		int y2 = Integer.parseInt(st.nextToken()) + 1000;
		for(int j = x1; j < x2; j++) {
			for(int k = y1; k < y2; k++) {
				c[j][k] = false; 
			}
		}
		int count = 0;
		for(int i = 0; i < 2001; i++) {
			for(int j = 0; j < 2001; j++) {
				if(c[i][j]) count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
