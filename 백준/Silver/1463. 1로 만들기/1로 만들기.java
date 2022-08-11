import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		static int[] b = new int[10000000];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		sb.append(dp(a));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dp(int a) {
		// TODO Auto-generated method stub
		if(a == 1) return 0;
		if(b[a] > 0) return b[a];
		b[a] = dp(a - 1) + 1;
		if(a % 2 == 0) {
			int tmp = dp(a / 2) + 1;
			if(b[a] > tmp) b[a] = tmp;
		}
		if(a % 3 == 0) {
			int tmp = dp(a / 3) + 1;
			if(b[a] > tmp) b[a] = tmp;
		}
		return b[a];
	}

}
