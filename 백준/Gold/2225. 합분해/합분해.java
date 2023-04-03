

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static int MOD = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int nn = n + k - 1;
        int kk = k - 1;
        BigInteger a = fac(nn);
        BigInteger b = fac(n);
        BigInteger c = fac(kk);
        
        sb.append(a.divide(b.multiply(c)).mod(new BigInteger("1000000000")));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
	private static BigInteger fac(int f) {
		// TODO Auto-generated method stub
		BigInteger tmp = BigInteger.ONE;
		for(int i = 1; i <= f; i++) {
			tmp = tmp.multiply(new BigInteger(Integer.toString(i)));
		}
		return tmp;
	}

}