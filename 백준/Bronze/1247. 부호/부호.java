import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String a;
		while((a = br.readLine()) != null) {
			int b = Integer.parseInt(a);
			BigInteger c = BigInteger.ZERO;
			while(b --> 0) {
				long d = Long.parseLong(br.readLine());
				BigInteger e = BigInteger.valueOf(d);
				c = c.add(e);
			}
			BigInteger g = BigInteger.ZERO;
			if(c.compareTo(g) == -1) {
				sb.append("-").append("\n");
			}else if(c.compareTo(g) == 0) {
				sb.append("0").append("\n");
			}else {
				sb.append("+").append("\n");
			}
				
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
