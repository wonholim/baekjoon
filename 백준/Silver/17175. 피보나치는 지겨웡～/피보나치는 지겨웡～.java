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
		int a = Integer.parseInt(br.readLine());
		b = new long[51];

			sb.append(dp(a));
	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static long dp(int a) {
		// TODO Auto-generated method stub
		if(a == 0) return 1;
		if(a == 1) return 1;
		if(b[a] > 0) return b[a];
		return b[a] =  (dp(a - 1) + dp(a - 2) + 1) % 1000000007;
	}

}
