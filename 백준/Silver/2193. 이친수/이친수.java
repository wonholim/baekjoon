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
		b = new long[91];
		b[0] = 0;
		b[1] = 1;
		for(int i = 2; i <= a; i++) {
			b[i] = b[i - 1] + b[i - 2];
		}
		sb.append(b[a]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
