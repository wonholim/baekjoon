

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	/* 연속합 구하는 문제.
	 * n개의 임의의 수열에서 연속된 합이 가장 큰 값을 구하는 것.
	 * dp 전항과 이후 항의 합, 이리고, 첫항의 합중 큰 값을 dp배열에 넣어준다.
	 * Dp지만, 두포인터로도 충분히 가능할 듯?
	 * */
	static int[] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		int[] dp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = c[0];
		int max = dp[0];
		for(int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + c[i], c[i]);
			max = Math.max(max, dp[i]);
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
