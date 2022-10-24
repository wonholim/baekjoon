import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			long b = Long.parseLong(br.readLine());
			while(true) {
				boolean check = isPrime(b);
				if(check) break;
				else b++;
			}
			sb.append(b + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean isPrime(long b2) {
		// TODO Auto-generated method stub
		if(b2 < 2 || (b2 % 2 == 0 && b2 != 2)) return false;
		for(int i = 3; i <= Math.sqrt(b2); i = i + 2) {
			if(b2 % i == 0) {
				return false;
			}
		}
		return true;
	}

}
