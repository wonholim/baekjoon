

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] set = new int[t];
		int[] single = new int[t];
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			set[i] = Integer.parseInt(st.nextToken());
			single[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(set);
		Arrays.sort(single);
		if(a % 6 == 0) {
			sb.append(Math.min((a / 6) * set[0], a * single[0]));
		}else {
			int tmp = Math.min((a / 6) * set[0] + (a % 6) * single[0],((a / 6) + 1) * set[0]);
			sb.append(Math.min(tmp, a * single[0]));
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
