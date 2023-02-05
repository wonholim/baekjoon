

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static class Person implements Comparable<Person>{
		String name;
		int y, m, d;
		public Person(String name, int y, int m, int d) {
			this.name = name;
			this.y = y;
			this.m = m;
			this.d = d;
		}
		@Override
		public int compareTo(Person o) {
			// TODO Auto-generated method stub
			if(this.y == o.y) {
				if(this.m == o.m) {
					return this.d - o.d;
				}else {
					return this.m - o.m;
				}
			}else {
				return this.y - o.y;
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		ArrayList<Person> list = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			String n = st.nextToken();
			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Person(n, y, m, d));
		}
		Collections.sort(list);
		sb.append(list.get(t - 1).name + "\n" + list.get(0).name);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
