import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		sb.append(dac(a, b));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static long dac(long a, long b) {
		// TODO Auto-generated method stub
		if(b == 0) return 1;
		
		long dc = dac(a, b / 2);
		
		if(b % 2 == 0) return (dc % c * dc % c);
		else return (dc % c * dc % c * a % c);
	}

}
