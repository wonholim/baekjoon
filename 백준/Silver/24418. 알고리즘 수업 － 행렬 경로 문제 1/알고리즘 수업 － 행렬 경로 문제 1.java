

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] c = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		count = 1;
		recursion(c, n - 1, n - 1);
		sb.append(count + " " + (n * n));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int recursion(int[][] c, int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || j < 0) return 0;
		count++;
		return c[i][j] + Math.max(recursion(c, i - 1, j), recursion(c, i, j - 1));
	}

}
