import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static int[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Long a = Long.parseLong(br.readLine());
		b = new int[1500001];
		b[0] = 0;
		b[1] = 1;
		for(int i = 2; i < 1500000; i++) {
			b[i] = (b[i - 1] + b[i - 2]) % 1000000;
		}
		sb.append(b[(int) (a % 1500000)]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
