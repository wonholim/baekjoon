

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
		for (int i = 0; i < n; i++) {
			c[i] = Long.parseLong(st.nextToken());
		}
		long[] v = new long[3];
		Arrays.sort(c);
		long bSum = 3000000000000L;
		for(int i = 0; i < n - 2; i++) {
			int l = i + 1;
			int r = n - 1;
			while(l < r) {
				long sum = c[l] + c[r] + c[i];
				if(Math.abs(sum) < bSum) {
					v[0] = c[l];
					v[1] = c[r];
					v[2] = c[i];
					bSum = Math.abs(sum);
				}
				if(sum > 0) r--;
				else l++;
			}
		}
		Arrays.sort(v);
		sb.append(v[0] + " " + v[1] + " " + v[2]);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
