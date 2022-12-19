

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		Set<String> s = new HashSet<>();
		Map<String, Integer> m = new HashMap<>();
		double ac = 0;
		double wa = 0;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			String name = st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			if(name.equals("megalusion")) {
				continue;
			}else if(k == 4 && !s.contains(name)) {
				ac++;
				s.add(name);
				if(m.get(name) != null) {
					wa += m.get(name);
				}
			}else if(k != 4 && !s.contains(name)) {
				m.put(name, m.getOrDefault(name, 0) + 1);
			}
		}
		if(ac == 0) sb.append(0);
		else sb.append((ac / (ac + (wa))) * 100);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
