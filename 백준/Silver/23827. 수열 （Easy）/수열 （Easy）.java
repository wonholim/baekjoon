

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int MOD = 1_000_000_007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long[] c = new long[n];
		long tmp = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			tmp += c[i];
		}
		long sum = 0;
		for(int i = 0; i < n - 1; i++) {
			tmp -= c[i];
			sum = ( sum + (c[i] * tmp)) % MOD;
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
