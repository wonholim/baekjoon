

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
	static int count;
	static int MOD = 1_000_000_007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		BigInteger sum = new BigInteger("1");
		for(int i = 1; i <= 2 * n; i++) {
			sum = sum.multiply(new BigInteger("" + i));
		}
		BigInteger sum2 = new BigInteger("1");
		for(int i = 1; i <= n; i++) {
			sum2 = sum2.multiply(new BigInteger("" + i));
		}
		sum2 = sum2.multiply(sum2);
		sb.append(sum.divide(sum2).mod(new BigInteger("" + MOD)) + " " + n * n);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
