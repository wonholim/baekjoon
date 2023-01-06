

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2;
		StringBuilder sb3;
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i <= t; i++) {
			sb.append("Case #" + i + ": ");
			long k = Long.parseLong(br.readLine());
			int cnt = 0;
			Set<Long> s = new HashSet<>();
			for(long j = 1; j * j <= k; j++) {
				if(k % j == 0) {
					sb3 = new StringBuilder(Long.toString(j));
					if(Long.toString(j).equals(sb3.reverse().toString())) s.add(j);
					sb2 = new StringBuilder(Long.toString(k / j));
					if(Long.toString(k / j).equals(sb2.reverse().toString())) s.add(k / j);
				}
			}
			sb.append(s.size() + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
