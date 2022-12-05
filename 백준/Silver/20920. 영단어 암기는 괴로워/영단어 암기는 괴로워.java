

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<String, Integer> m = new HashMap<>();
		int t = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			String k = br.readLine();
			if(k.length() < l) continue;
			m.put(k, m.getOrDefault(k, 0) + 1);
		}
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue() == o2.getValue()) {
					if(o1.getKey().length() == o2.getKey().length()) {
						return o1.getKey().compareTo(o2.getKey());
					}else {
						return o2.getKey().length() - o1.getKey().length();
					}
				}else {
					return o2.getValue() - o1.getValue();
				}
			}
			
		});
		for(Entry<String, Integer> k : list) {
			sb.append(k.getKey() + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
