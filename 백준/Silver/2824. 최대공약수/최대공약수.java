
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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		st = new StringTokenizer(br.readLine());
		while(a --> 0) {
			BigInteger d = new BigInteger(st.nextToken());
			b = b.multiply(d);
		}
		int e = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while(e --> 0) {
			BigInteger f = new BigInteger(st.nextToken());
			c = c.multiply(f);
		}
		String g = b.gcd(c).toString();
		if(g.length() > 9) {
			for(int i = g.length() - 9; i < g.length(); i++) {
				sb.append(g.charAt(i));
			}
		}else {
			sb.append(g);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
