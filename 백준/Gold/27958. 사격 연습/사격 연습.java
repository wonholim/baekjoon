
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
	static int max = 0;
	static int[] b;
	static int n;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		int[][] c = new int[n][n];
		int[][] d = new int[n][n];
		int k = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				int l = Integer.parseInt(st.nextToken());
				d[i][j] = l;
				c[i][j] = l;
			}
		}
		b = new int[k];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		go(d, c, 0, 0);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void go(int[][] d, int[][] c, int i, int m) {
		// TODO Auto-generated method stub
		if(i == b.length) {
			max = Math.max(max, m);
			return;
		}else {
			for (int q = 0; q < n; q++) {
				for (int w = 0; w < n; w++) {
					if(c[q][w] == 0) continue;
					if (c[q][w] < 10 && b[i] >= c[q][w]) {
						int tmp = d[q][w];
						int[][] tmppp = new int[n][n];
						int[][] tmpp = new int[n][n];
						for(int a = 0; a < n; a++) {
							System.arraycopy(c[a], 0, tmpp[a], 0, n);
							System.arraycopy(d[a], 0, tmppp[a], 0, n);
						}
						c = gogo(d, q, w);
						d = gogo(d, q, w);
						go(d, c, i + 1, m + tmp);
						c = tmpp;
						d = tmppp;
						break;
					} else if (c[q][w] >= 10) {
						int tmp = c[q][w];
						c[q][w] = 0;
						d[q][w] = 0;
						go(d, c, i + 1, m + tmp);
						c[q][w] = tmp;
						d[q][w] = tmp;
						break;
					} else {
						c[q][w] = c[q][w] - b[i];
						go(d, c, i + 1, m);
						c[q][w] = c[q][w] + b[i];
						break;
					}
				}
			}
		}
	}
	private static int[][] gogo(int[][] c, int q, int w) {
		// TODO Auto-generated method stub
		int[][] tmp = new int[n][n];
		for(int a = 0; a < n; a++) {
			System.arraycopy(c[a], 0, tmp[a], 0, n);
		}
		for(int k = 0; k < 4; k++) {
			int i = q + dx[k];
			int j = w + dy[k];
			if(i >= 0 && j >= 0 && i < n && j < n) {
				if(tmp[i][j] == 0) {
					tmp[i][j] = (int) Math.floor((double) tmp[q][w] / 4);
				}
			}
		}
		tmp[q][w] = 0;
		return tmp;
	}

}
