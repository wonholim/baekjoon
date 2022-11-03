

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
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		boolean[] c = new boolean[10000001];
		c[1] = true;
		for(int i = 2; i < 10000001; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j < 10000001; j = i + j) {
				c[j] = true;
			}
		}
		int count = 0;
		for(int i = 1; i <= 10000000; i++) {
			if(c[i]) continue;
			for(int j = 2; ; j++) {
				if((long)Math.pow(i, j) < a) continue;
				else if((long)Math.pow(i, j) > b) break;
				else count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
