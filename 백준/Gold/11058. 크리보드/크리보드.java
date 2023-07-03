import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[101];
		for(int i = 0; i < 7; i++) dp[i] = i;
		for (int i = 7; i <= n; i++) {
			for (int j = 4; j > 1; j--) {
				dp[i] = Math.max(dp[i], dp[i - j - 1] * j);
			}
		}
		System.out.println(dp[n]);
	}

}
