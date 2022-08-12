import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int c = Integer.parseInt(br.readLine());
			b = new int[41];
			b[1] = 1;
			b[2] = 1;
			int d = dp(c);
			if(c == 0) {
				sb.append("1").append(" ").append(d).append("\n");
			}else {
				sb.append(b[c - 1]).append(" ").append(d).append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dp(int a) {
		// TODO Auto-generated method stub
		if(a == 0) return 0;
		if(a == 1) return 1;
		if(b[a] > 0) return b[a];
		return b[a] = dp(a - 1) + dp(a - 2);
	}
}
