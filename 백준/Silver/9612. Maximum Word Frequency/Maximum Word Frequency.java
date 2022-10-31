

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		SortedSet<String> s = new TreeSet<>();
		Map<String, Integer> m = new HashMap<>();
		while(a --> 0) {
			String g = br.readLine();
			s.add(g);
			m.put(g, m.getOrDefault(g, 0) + 1);
		}
		String name = "";
		int max = 0;
		for(String k : s) {
			if(m.get(k) >= max) {
				name = k;
				max = m.get(k);
			}
		}
		sb.append(name + " " + max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
