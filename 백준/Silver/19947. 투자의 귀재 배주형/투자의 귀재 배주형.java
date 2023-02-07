

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
		int m = Integer.parseInt(st.nextToken());
		int[] dp = new int[m + 1];
		dp[0] = n;
		for(int i = 1; i <= m; i++) {
			dp[i] = (int) Math.floor(dp[i - 1] * 1.05);
			if(i >= 3) dp[i] = Math.max(dp[i], (int) Math.floor(dp[i - 3] * 1.20));
			if(i >= 5) dp[i] = Math.max(dp[i], (int) Math.floor(dp[i - 5] * 1.35));
		}
		sb.append(dp[m]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
