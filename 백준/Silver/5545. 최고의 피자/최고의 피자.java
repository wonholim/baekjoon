

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
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int tp = Integer.parseInt(st.nextToken());
		
		int d = Integer.parseInt(br.readLine());
		Integer[] c = new Integer[t];
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c, Collections.reverseOrder());
		int first = (int)((d) / (p));
		int j = 1;
		while(true) {
			if(j > t) break;
			int sum = d;
			for(int i = 0; i < j; i++) {
				sum += c[i];
			}
			if(first <= (int)((sum) / (p + (tp * j)))) {
				first = (int)((sum) / (p + (tp * j)));
				j++;
			}else break;
			
		}
		sb.append(first);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
