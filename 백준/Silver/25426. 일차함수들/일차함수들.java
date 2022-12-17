

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder a = new StringBuilder();
		StringTokenizer st;
		long sum = 0;
		int n = Integer.parseInt(br.readLine());
		long[] c = new long[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			c[i] = Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);
		for(int i = 1; i <= n; i++) {
			sum += (c[i - 1] * i);
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
