

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static int x;
	static int y;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		c = new int[x][y];
		for(int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < y; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int max = 0;
		int q = 0;
		int w = 0;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				int tmp = counting(i, j);
				if(tmp > max) {
					max = tmp;
					q = i;
					w = j;
				}
			}
		}
		sb.append(max + "\n" + (q + 1) + " " + (w + 1));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int counting(int i, int j) {
		// TODO Auto-generated method stub
		if(i + 3 >= x || j + 3 >= y) return 0;
		int count = 0;
		for(int q = i; q < i + 3; q++) {
			for(int w = j; w < j + 3; w++) {
				count += c[q][w];
			}
		}
		return count;
	}

}
