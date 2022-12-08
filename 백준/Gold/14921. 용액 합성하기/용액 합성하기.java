

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
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] c = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int r = n - 1;
		int l = 0;
		int bSum = Math.abs(c[l] + c[r]);
		int v1 = c[l];
		int v2 = c[r];
		while(l < r) {
			int sum = c[l] + c[r];
			if(Math.abs(sum) < bSum) {
				v1 = c[l];
				v2 = c[r];
				bSum = Math.abs(sum);
			}
			
			if(sum > 0) r--;
			else l++;
		}
		sb.append(v1 + v2);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
