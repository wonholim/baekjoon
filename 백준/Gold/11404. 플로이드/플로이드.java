import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int MAX = 999999999;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int[][] c = new int[a][a];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(i != j) {
					c[i][j] = MAX;
				}
			}
		}
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken()) - 1;
			int e = Integer.parseInt(st.nextToken()) - 1;
			int f = Integer.parseInt(st.nextToken());
			c[d][e] = Math.min(c[d][e], f);

		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				for(int k = 0; k < a; k++) {
					c[j][k] = Math.min(c[j][k], c[j][i] + c[i][k]);
				}
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(c[i][j] == MAX) sb.append(0 + " ");
				else sb.append(c[i][j] + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
