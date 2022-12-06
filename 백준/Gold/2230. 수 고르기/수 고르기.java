

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
		int m = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c);
		int min = Integer.MAX_VALUE;
		int r = 0;
		for(int l = 0; l < n; l++) {
			while(r < n - 1 && c[r] - c[l] < m) {
				r++;
			}
			if(c[r] - c[l] >= m) min = Math.min(min, c[r] - c[l]);
		}
		sb.append(min);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
