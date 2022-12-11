

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		Integer[] c = new Integer[t];
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c);
		long sum1 = 0;
		long sum2 = 0;
		for(int i = 0; i < t; i++) {
			long k = c[i] - (i);
			if(k < 0) continue;
			sum1 += k;
		}
		Arrays.sort(c, Collections.reverseOrder());
		for(int i = 0; i < t; i++) {
			long k = c[i] - (i);
			if(k < 0) continue;
			sum2 += k;
		}
		sb.append(Math.max(sum1, sum2));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
