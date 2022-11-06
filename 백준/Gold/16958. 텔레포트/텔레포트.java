
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
// 플로이드 워셜
public class Main {
	static int t;
	static int[][] c;
	static int[][] cc;
	static int INF = 100000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		c = new int[n + 1][3];
		cc = new int[n + 1][n + 1];
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				if(i != j) cc[i][j] = INF;
			}
		}
		for(int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			c[i][0] = Integer.parseInt(st.nextToken());
			c[i][1] = Integer.parseInt(st.nextToken());
			c[i][2] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				if(i != j) {
					int g = Math.abs(c[i][1] - c[j][1]) + Math.abs(c[i][2] - c[j][2]);
					if(c[i][0] == 1 && c[j][0] == 1) {
						if(g > t) {
							g = t;
						}
					}
					cc[i][j] = cc[j][i] = g;
				}
			}
		}
		for(int k = 1; k < n + 1; k++) {
			for(int i = 1; i < n + 1; i++) {
				for(int j = 1; j < n + 1; j++) {
					cc[i][j] = Math.min(cc[i][j], cc[i][k] + cc[k][j]);
				}
			}
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int o = Integer.parseInt(st.nextToken());
			sb.append(cc[p][o] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
