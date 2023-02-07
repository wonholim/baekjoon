

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	/* 디피 배열에서 제곱수는 항상 1이다. 
	 * 그렇다면 값 t가 들어올 때, 최솟값은 어떻게 해야될가.
	 * 제곱수의 값이 1이므로 각각 최소의 값을 유지하며, 만들어진 배열의 값의 최솟값을 더해주면 된다.
	 * 즉 bottom-up방식으로 1부터 n까지 구한뒤 dp[t]를 구하면 될것같다.
	 * */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[] dp = new int[50001];
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
