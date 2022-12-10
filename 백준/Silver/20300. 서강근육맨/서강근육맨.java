

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
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
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(c);
		long max = 0;
		if(n % 2 == 0) {
			max = 0;
			int j = n - 1;
			for(int i = 0; i < n / 2; i++) {
				max = Math.max(max, c[i] + c[j]);
				j--;
			}
		}else {
			max = 0;
			int j = n - 2;
			for(int i = 0; i < n / 2; i++) {
				max = Math.max(max, c[i] + c[j]);
				j--;
			}
			max = Math.max(max, c[n - 1]);
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
