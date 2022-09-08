import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static long poww = 1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger count = BigInteger.TWO;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		for(int i = 0; i <= 30; i++) {
			long pow = (long) Math.pow(2, i);
			if(pow == a) {
				sb.append(1);
				break;
			}else if(pow > a) {
				sb.append(0);
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}