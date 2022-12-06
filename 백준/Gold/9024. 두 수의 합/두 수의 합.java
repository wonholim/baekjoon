

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
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] c = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				c[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(c);
			int l = 0;
			int r = n - 1;
			int count = 1;
			int bestK = 2100000000;
			while(l < r) {
				int sum = c[l] + c[r];
				if(Math.abs(k - sum) < bestK) {
					bestK = Math.abs(k - sum);
					count = 1;
				}else if(Math.abs(k - sum) == bestK) {
					count++;
				}
				if(sum > k) r--;
				else l++;
			}
			sb.append(count + "\n");
		}
		
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
