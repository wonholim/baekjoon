

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
		long[] c = new long[t - 1];
		st = new StringTokenizer(br.readLine());
		long k = Integer.parseInt(st.nextToken());
		for(int i = 0; i < t- 1; i ++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);
		for(int i = 0; i < t - 1; i++) {
			if(c[i] >= k) {
				System.out.println("No");
				return;
			}else {
				k += c[i];
			}
		}
		sb.append("Yes");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
