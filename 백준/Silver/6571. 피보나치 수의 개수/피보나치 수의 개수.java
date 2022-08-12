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
		b = new BigInteger[10001];
		b[0] = BigInteger.ZERO;
		b[1] = BigInteger.ONE;
		b[2] = BigInteger.ONE;
		for(int i = 3; i <= 10000; i++) {
			b[i] = b[i - 1].add(b[i - 2]);
		}
		while(true) {
			int count = 0;
			st = new StringTokenizer(br.readLine());
			BigInteger d = new BigInteger(st.nextToken());
			if(d.compareTo(BigInteger.ONE) != 1) count++;
			BigInteger c = new BigInteger(st.nextToken());
			if(d.compareTo(BigInteger.ZERO) == 0 && c.compareTo(BigInteger.ZERO) == 0) break;
			for(int i = 3; i <= 10000; i++) {
				if((b[i].compareTo(d) != -1) && b[i].compareTo(c) != 1) {
					count++;
				}else if(b[i].compareTo(c) == 1) break;
			}
			sb.append(count).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}