

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for(int k = 1; k <= t; k++) {
			int n = Integer.parseInt(br.readLine());
			long[] a = new long[n];
			long[] b = new long[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(a);
			Arrays.sort(b);
			long sum = 0;
			int j = n - 1;
			for(int i = 0; i < n; i++) {
				sum += a[i] * b[j];
				j--;
			}
			sb.append("Case #" + k + ": " + sum + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
