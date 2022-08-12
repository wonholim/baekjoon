import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BigInteger[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		b = new BigInteger[10001];
		b[0] = BigInteger.ZERO;
		b[1] = BigInteger.ONE;
		b[2] = BigInteger.ONE;
		for(int i = 3; i <= 10000; i++) {
			b[i] = b[i - 1].add(b[i - 2]);
		}
		int i = 1;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("Case #").append(i).append(": ").append(b[d].remainder(BigInteger.valueOf(c))).append("\n");
			i++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
