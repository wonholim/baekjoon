
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
		int[] w = new int[n + 1];
		int[] v = new int[n + 1];
		int[][] dp = new int[n + 1][k + 1];
		for(int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				if(j >= w[i]) dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				else dp[i][j] = dp[i - 1][j];
			}
		}
		sb.append(dp[n][k]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
