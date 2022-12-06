

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
		int a = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] c = new int[a];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int r = 0;
		int min = 100000001;
		int sum = c[0];
		for(int l = 0; l < a; l++) {
			
			if(l != 0) {
				sum -= c[l - 1];
			}
			while(r + 1 < a && sum < k) {
				r++;
				sum += c[r];
			}
			
			if(sum >= k) {
				min = Math.min(min, (r - l) + 1);
			}
		}
		if(min == 100000001) sb.append(0);
		else sb.append(min);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
