
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int t = n;
		long[] c = new long[n];
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			c[n] = Integer.parseInt(st.nextToken());
		}
		long p = c[0];
		long q = c[0] * c[1] + 1;
		for(int i = 2; i < t; i++) {
			p = p + q * c[i];
			long tmp = p;
			p = q;
			q = tmp;
		}
		sb.append(q - p + " " + q);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
