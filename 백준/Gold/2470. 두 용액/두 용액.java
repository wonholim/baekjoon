

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
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);
		int min = c[0];
		int max = c[n - 1];
		int tmp = Math.abs(max + min);
		int l = 0;
		int r = n - 1;
		while(l < r) {
			int sum = c[r] + c[l];
			if(Math.abs(sum) < tmp) {
				tmp = Math.abs(sum);
				min = c[l];
				max = c[r];
			}
			if(sum > 0) {
				r--;
			}else {
				l++;
			}
		}
		sb.append(min + " " + max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
