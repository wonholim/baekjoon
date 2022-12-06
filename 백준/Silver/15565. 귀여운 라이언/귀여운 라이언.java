

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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int min = Integer.MAX_VALUE;
		int count = 0;
		int sum = c[0];
		if(c[0] == 1) count++;
		int r = 0;
		for(int l = 0; l < n; l++) {
			if(l != 0) {
				if(c[l - 1] == 1) count--;
			}
			
			while(r < n - 1 && count < k) {
				r++;
				if(c[r] == 1) count++;
			}
			if(count >= k)  min = Math.min(min, (r - l) + 1);
		}
		if(min == Integer.MAX_VALUE) sb.append(-1);
		else sb.append(min);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
