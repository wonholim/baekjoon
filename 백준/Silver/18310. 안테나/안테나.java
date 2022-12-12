

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		long[] c = new long[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);
		int index = 0;
		if(t % 2 != 0) {
			index = t / 2;
		}else {
			long sum = 0;
			long sum2 = 0;
			for(int i = 0; i < t; i++) {
				sum += Math.abs(c[i] - (c[(t / 2) - 1]));
			}
			for(int i = 0; i < t; i++) {
				sum2 += Math.abs(c[i] - (c[(t / 2)]));
			}
			if(sum <= sum2) {
				index = (t / 2) - 1;
			}else {
				index = t / 2;
			}
		}
		sb.append(c[index]);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
