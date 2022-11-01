

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		while(a --> 0) {
			int i = Integer.parseInt(br.readLine());
			SortedSet<Integer> s = new TreeSet<>();
			Map<Integer, Integer> m = new HashMap<>();
			while(i --> 0) {
				int k = Integer.parseInt(br.readLine());
				s.add(k);
				m.put(k, m.getOrDefault(k, 0) + 1);
			}
			int max = 0;
			int index = 0;
			for(int g : s) {
				if(m.get(g) > index) {
					max = g;
					index = m.get(g);
				}
			}
			sb.append(max + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
