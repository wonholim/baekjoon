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
		b = new int[31];
		sb.append(dp(a));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dp(int a) {
		// TODO Auto-generated method stub
		if(a == 0) return 1;
		if(a == 1) return 0;
		if(a == 2) return 3;
		if(b[a] > 0) return b[a];
		int tmp = 3 * dp(a - 2);
		for(int i = 4; i <= a; i = i + 2) {
			tmp += 2 * dp(a - i);
		}
		return b[a] = tmp;
	}

}
