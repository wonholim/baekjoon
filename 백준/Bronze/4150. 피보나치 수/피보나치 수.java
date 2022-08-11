import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	static BigInteger[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		b = new BigInteger[1000001];
		b[1] = BigInteger.ZERO;
		b[1] = BigInteger.ONE;
		b[2] = BigInteger.ONE;
		for(int i = 3; i <= a; i++) {
			b[i] = b[i - 1].add(b[i - 2]);
		}
		sb.append(b[a]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
