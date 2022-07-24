import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = gcd(a, b);
		bw.write(Long.toString(a / c) + ":" + Long.toString(b / c));
		bw.flush();
		bw.close();
		br.close();
	}
	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}
