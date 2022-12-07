

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
		double s = Double.parseDouble(br.readLine());
		int k = 0;
		if(s >= 1.98) k = 2;
		else if(s >= 0.99) k = 1;
		else k = 0;
		int n = Integer.parseInt(br.readLine());
		int[] c = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		for(int i = 1; i < n + 1; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, c[i]);
		}
		int r = 0;
		int count = 0;
		int day = 0;

		for(int l = 1; l < n + 1; l++) {
			
			while(r + 1 <= n && count <= k) {
				if(count == k && c[r + 1] == 0) break;
				else {
					if(c[r + 1] == 0) count++;
					r++;
				}
			}
			if(c[l] == 0) count--;
			day = Math.max(day, r - l + 1);
		}
		sb.append(day + "\n" + max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
