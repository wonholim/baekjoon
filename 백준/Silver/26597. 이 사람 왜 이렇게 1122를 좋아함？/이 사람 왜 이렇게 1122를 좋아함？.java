

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		long low = -1_000_000_000_000_000_000L;
		long high = 1_000_000_000_000_000_000L;
		boolean check = false;
		int index = 0;
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			long k = Long.parseLong(st.nextToken());
			String point = st.nextToken();
			if(point.equals("^")) {
				if(low <= k) {
					low = k + 1;
				}
			}else {
				if(high >= k) {
					high = k - 1;
				}
			}
			if(low == high && !check) {
				check = true;
				index = i;
			}else if(low > high || high < low) {
				System.out.println("Paradox!");
				System.out.println(i);
				return;
			}
		}
		if(check) {
			System.out.println("I got it!");
			System.out.println(index);
			return;
		}else {
			sb.append("Hmm...");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
