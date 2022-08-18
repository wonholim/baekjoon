import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static long[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		b = new long[1000001];
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
		int b = Integer.parseInt(br.readLine());
		sb.append(dp(b) % 1000000009).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static long dp(int a) {
		// TODO Auto-generated method stub
		if(a == 1) return 1;
		if(a == 2) return 2;
		if(a == 3) return 4;
		if(b[a] > 0) return b[a];
		return b[a] = (dp(a - 1) + dp(a - 2) + dp(a - 3)) % 1000000009;
	}
}
