

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);
		double sum = c[t - 1];
		for(int i = 0; i < t - 1; i++) {
			sum += (double)c[i] / 2;
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
