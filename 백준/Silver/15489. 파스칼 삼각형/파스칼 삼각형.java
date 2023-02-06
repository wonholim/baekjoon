

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int[][] c = new int[r + w + 1][r + w + 1];
		for(int i = 0; i < r + w + 1; i++) {
			c[i][0] = 1;
		}
		for(int i = 1; i < r + w + 1; i++) {
			for(int j = 1; j <= i; j++) {
				c[i][j] = c[i - 1][j] + c[i - 1][j - 1];
			}
		}
		int sum = 0;
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < i + 1; j++) {
				sum += c[r + i - 1][q + j - 1];
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
