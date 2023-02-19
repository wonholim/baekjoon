

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= t; i++) {
			Set<Long> s = new HashSet<>();
			Map<Long, Integer> m = new HashMap<>();
			int t1 = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			while(t1 --> 0) {
				long k = Integer.parseInt(st.nextToken());
				m.put(k, m.getOrDefault(k, 0) + 1);
				s.add(k);
			}
			sb.append("Case #" + i + ": ");
			for(long k : s) {
				if(m.get(k) == 1) {
					sb.append(k + "\n");
				}
			}
		}
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
