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
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] c = new int[n][n];
		for(int i = 0; i < n; i++) {
			c[i][0] = 1;
		}
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				c[i][j] = c[i - 1][j] + c[i - 1][j - 1];
			}
		}
		sb.append(c[n - 1][k - 1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
