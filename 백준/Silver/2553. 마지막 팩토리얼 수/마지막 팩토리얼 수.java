

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long sum = 1;
		for(int i = 2; i <= n; i++) {
			sum = sum * i;
			while(sum % 10 == 0) {
				sum = sum / 10;
			}
			sum = sum % 1000000000;
		}
		sb.append(sum % 10);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
