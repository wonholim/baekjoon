

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), "-");
			String g = st.nextToken();
			String k = st.nextToken();
			int sum = 0;
			int j = g.length() - 1;
			for(int i = 0; i < 3; i++) {
				sum += Math.abs((g.charAt(i) - 'A') * Math.pow(26, j));
				j--;
			}
			sum = Math.abs(sum - Integer.parseInt(k));
			if(sum <= 100) sb.append("nice\n");
			else sb.append("not nice\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
