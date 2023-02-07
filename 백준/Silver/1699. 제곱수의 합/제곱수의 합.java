
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
		int t = Integer.parseInt(st.nextToken());
		int[] dp = new int[100001];
		dp[1] = 1;
		for(int i = 2; i <= t; i++) {
			dp[i] = dp[1] + dp[i - 1];
			for(int j = 2; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
			}
		}
		sb.append(dp[t]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
