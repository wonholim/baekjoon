

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] c = new int[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int max = 898989898;
		int index = 0;
		for(int i = 1; i <= 10000; i++) {
			int sum = 0;
			for(int j = 0; j < t; j++) {
				sum += Math.abs(c[j] - i);
			}
			if(max > sum) {
				max = sum;
				index = i;
			}
		}
		sb.append(index);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
