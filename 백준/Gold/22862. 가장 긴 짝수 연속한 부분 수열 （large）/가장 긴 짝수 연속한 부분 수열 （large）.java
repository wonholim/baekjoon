

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
		int[] c = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int r = 0;
		int count = 0;
		for(int l = 1; l <= n; l++) {
			
			while(r + 1 <= n && count <= k) {
				if(count == k && c[r + 1] % 2 == 1) break;
				if(c[r + 1] % 2 == 1) count++;
				r++;
			}
			max = Math.max(max, r - l + 1 - count);
			if(c[l] % 2 == 1) count--;
		}
		sb.append(max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
