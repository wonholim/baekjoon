

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
		int t = Integer.parseInt(br.readLine());
		long[] c = new long[t];
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c);
		long sum = 0;
		for(int i = 0; i < t; i++) {
			sum += Math.abs(c[i] - (i + 1));
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
