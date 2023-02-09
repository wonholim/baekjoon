

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
		for(int i = 1; i <= n; i++) {
			sb.append(i + " ");
			if(i % 6 == 0) {
				sb.append("Go! ");
			}
		}
		if(n % 6 != 0) sb.append("Go!");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
