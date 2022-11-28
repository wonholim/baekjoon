

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int MOD = 1_000_000_007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(br.readLine());
		sb.append(pow(m, n - 1));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static long pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			return 1;
		}else {
			long n = pow(a, b / 2);
			if(b % 2 == 0) return (( n % MOD )* ( n % MOD )) % MOD;
			else return (( a % MOD ) * ((n * n) % MOD)) % MOD;
		}
	}

}
