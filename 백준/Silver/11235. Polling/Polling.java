

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
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
		int t = Integer.parseInt(st.nextToken());
		ArrayList<String> list = new ArrayList<>();
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		while(t --> 0) {
			String name = br.readLine();
			m.put(name, m.getOrDefault(name, 0) + 1);
			s.add(name);
		}
		int max = 0;
		for(String k : s) {
			max = Math.max(max, m.get(k));
		}
		for(String k : s) {
			if(max == m.get(k)) {
				list.add(k);
			}
		}
		Collections.sort(list);
		for(String k : list) {
			sb.append(k + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
