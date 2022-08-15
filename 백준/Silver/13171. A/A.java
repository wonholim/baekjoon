import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long c = 1_000_000_007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		sb.append(dac(a % c, b) % c);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static long dac(long a, long b) {
		// TODO Auto-generated method stub
		if(b == 1) return a;
		
		long dc = dac(a, b / 2);
		
		if(b % 2 == 0) return (dc % c * dc % c);
		else return (dc % c * dc % c * a % c);
	}

}
