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
		b = new BigInteger[251];
		b[0] = BigInteger.ONE;
		b[1] = BigInteger.ONE;
		b[2] = BigInteger.valueOf(3);
		for(int i = 3; i < 251; i++) {
			b[i] = b[i - 1].add(b[i - 2].multiply(BigInteger.TWO));
		}
		String a;
		while((a = br.readLine()) != null) {
			int c = Integer.parseInt(a);
			sb.append(b[c]).append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
}
