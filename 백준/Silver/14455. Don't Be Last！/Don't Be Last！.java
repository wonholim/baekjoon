

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
	static class Cow implements Comparable<Cow>{
		String name;
		int milk;
		public Cow(String name, int milk) {
			this.name = name;
			this.milk = milk;
		}
		@Override
		public int compareTo(Cow o) {
			// TODO Auto-generated method stub
			return this.milk - o.milk;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		ArrayList<Cow> list = new ArrayList<>();
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int milk = Integer.parseInt(st.nextToken());
			m.put(name, m.getOrDefault(name, 0) + milk);
			s.add(name);
		}
		for(String n : s) {
			list.add(new Cow(n, m.get(n)));
		}
		Collections.sort(list);
		Cow c = list.get(0);
		int count = 1;
		for(int i = 1; i < list.size(); i++) {
			Cow g = list.get(i);
			if(c.milk == g.milk) {
				count++;
			}
			if(Math.ceil((double)list.size() / 2) <= count) {
				System.out.println("Tie");
				return;
			}
		}
		for(int i = 1; i < list.size(); i++) {
			Cow g = list.get(i);
			if(c.milk < g.milk) {
				System.out.println(g.name);
				return;
			}else {
				count++;
			}
		}
		if(list.size() == 1) sb.append(c.name);
		else sb.append("Tie");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
