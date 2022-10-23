

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		long[] b = new long[a];
			st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			b[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(b);
		int count = 0;
		long sum = 0;
		for(int i = 0; i < a; i++) {
			sum = b[i];
			int q = 0;
			int w = a - 1;
			while(true) {
				if(q == i) q++;
				else if(w == i) w--;
				
				if(q >= w) break;
				
				if(b[q] + b[w] == sum) {
					count++;
					break;
				}else if(b[q] + b[w] > sum) w--;
				else q++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
