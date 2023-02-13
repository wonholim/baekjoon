

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		long[] c = new long[n];
		long[] prefix = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) c[i] = Integer.parseInt(st.nextToken());
		prefix[0] = c[0];
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + c[i];
		}
		long sum = 0;
		for(int i = 1; i < n; i++) {
			sum += prefix[i - 1] * c[i];
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
