

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	/* 연속한 부분의 합을 찾아라! 근데 최댓값을..
	 * dp를 이용해서 구한다.
	 * 두포인터도 가능할 거같다.
	 * n이작아서 n2도 가능하다.
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
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
			sb.append(max + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
