import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long[] b;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		b = new long[101];
		b[1] = 1;
		b[2] = 1;
		b[3] = 1;
		b[4] = 2;
		b[5] = 2;
		while(a --> 0) {
			int c = Integer.parseInt(br.readLine());
			for(int i = 6; i <= c; i++) {
				b[i] = b[i - 2] + b[i - 3];
			}
			sb.append(b[c]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
