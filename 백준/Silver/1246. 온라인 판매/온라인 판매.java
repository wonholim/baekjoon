

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
		int a = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[t];
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c);
		int max;
		int index;
		if(a >= t) {
			max = 0;
			index = 0;
			for(int i = 0; i < t; i++) {
				if(c[i] * (t - i) > max) {
					max = c[i] * (t - i);
					index = c[i];
				}
			}
		}else {
			max = 0;
			index = 0;
			for(int i = t - a; i < t; i++) {
				if(c[i] * (t - i) > max) {
					max = c[i] * (t - i);
					index = c[i];
				}
			}
		}
		sb.append(index + " " + max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
