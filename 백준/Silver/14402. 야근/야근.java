

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		Map<String, Integer> m = new HashMap<>();
		int count = 0;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			String b = st.nextToken();
			String c = st.nextToken();
			if(c.equals("+")) {
				m.put(b, m.getOrDefault(b, 0) + 1);
			}else {
				if(m.get(b) != null) {
					if(m.get(b) == 0) {
						count++;
					}else {
						m.put(b, m.getOrDefault(b, m.get(b)) - 1);
					}
				}else {
					count++;
				}
			}
		}
		for(int k : m.values()) {
			count += k;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
