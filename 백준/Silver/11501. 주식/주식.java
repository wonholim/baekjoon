

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] c = new int[n];
			int[] d = new int[n];
			for(int i = 0; i < n; i++) {
				c[i] = Integer.parseInt(st.nextToken());
			}
			int max = c[n - 1];
			for(int i = n - 1; 0 <= i; i--) {
				if(max < c[i]) {
					max = c[i];
				}
				d[i] = max;
			}
			long sum = 0;
			for(int i = 0; i < n; i++) {
				sum += d[i] - c[i];
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
