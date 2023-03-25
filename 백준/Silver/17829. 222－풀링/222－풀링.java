

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		c = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sb.append(pulling(n, 0, 0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int pulling(int n, int i, int j) {
		// TODO Auto-generated method stub
		if(n == 2) {
			int[] tmp = new int[4];
			int index = 0;
			for(int x = i; x < i + 2; x++) {
				for(int y = j; y < j + 2; y++) {
					tmp[index++] = c[x][y];
				}
			}
			Arrays.sort(tmp);
			return tmp[2];
		}
		int[] tmp = new int[4];
		n = n / 2;
		tmp[0] = pulling(n, i, j);
		tmp[1] = pulling(n, i + n, j);
		tmp[2] = pulling(n, i, j + n);
		tmp[3] = pulling(n, i + n, j + n);
		Arrays.sort(tmp);
		return tmp[2];
	}

}
