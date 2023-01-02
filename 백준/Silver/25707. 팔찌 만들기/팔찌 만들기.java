

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		long[] c = new long[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			c[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(c);
		long sum = Math.abs(c[t - 1] - c[0]);
		for(int i = 1; i < t; i++) {
			sum += Math.abs(c[i - 1] - c[i]);
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
