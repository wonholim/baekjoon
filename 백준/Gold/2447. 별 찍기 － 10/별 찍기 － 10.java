

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		c = new boolean[n][n];
		star(0, 0, n, 0);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(c[i][j] ? "*" : " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void star(int i, int j, int n, int q) {
		// TODO Auto-generated method stub
		if(n == 3 && q == 0) {
			for(int x = i; x < i + 3; x++) {
				for(int y = j; y < j + 3; y++) {
					if(x == i + 1 && y == j + 1) c[x][y] = false;
					else c[x][y] = true;
				}
			}
			return;
		}else if(n == 3 && q == 1) {
			return;
		}
		int k = n / 3;
		if(q == 1) {
			star(i, j, k, 1);
			star(i + k, j, k, 1);
			star(i + 2 * k, j, k, 1);
			star(i, j + k, k, 1);
			star(i, j + 2 * k, k, 1);
			star(i + k, j + k, k, 1);
			star(i + k, j + 2 * k, k, 1);
			star(i + 2 * k, j + k, k, 1);
			star(i + 2 * k, j + 2 * k, k, 1);
		}else {
			star(i, j, k, 0);
			star(i + k, j, k, 0);
			star(i + 2 * k, j, k, 0);
			star(i, j + k, k, 0);
			star(i, j + 2 * k, k, 0);
			star(i + k, j + k, k, 1);
			star(i + k, j + 2 * k, k, 0);
			star(i + 2 * k, j + k, k, 0);
			star(i + 2 * k, j + 2 * k, k, 0);
		}
		
	}

}
