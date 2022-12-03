

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			br.readLine();
			int n = Integer.parseInt(br.readLine());
			BigInteger sum = BigInteger.ZERO;
			for(int i = 0; i < n; i++) {
				BigInteger k = new BigInteger(br.readLine());
				sum = sum.add(k);
			}
			BigInteger q = new BigInteger(Integer.toString(n));
			if(sum.remainder(q).compareTo(BigInteger.ZERO) == 0) sb.append("YES\n");
			else sb.append("NO\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
