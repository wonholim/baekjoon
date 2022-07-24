import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String base = br.readLine();
		String target = br.readLine();
		StringBuilder sb = new StringBuilder(base);
		StringBuilder sb1 = new StringBuilder(target);
		int a = base.length();
		int b = target.length();
		int q = (a * b) / gcd(a, b);
		while(sb.length() != q) {
			sb = sb.append(base);
		}
		while(sb1.length() != q) {
			sb1 = sb1.append(target);
		}
		if(sb.toString().equals(sb1.toString())) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}
