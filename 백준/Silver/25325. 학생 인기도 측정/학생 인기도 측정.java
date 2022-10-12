import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static class Student{
		String name;
		int k;
		public Student(String name, int k) {
			this.name = name;
			this.k = k;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		ArrayList<Student> list = new ArrayList<>();
		int a = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String g = st.nextToken();
			m.put(g, 0);
			s.add(g);
		}
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String b = st.nextToken();
				m.put(b, m.getOrDefault(b, 0) + 1);
			}
		}
		for(String q : s) {
			list.add(new Student(q, m.get(q)));
		}
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.k != o2.k) {
					return o2.k - o1.k;
				}else {
					return o1.name.compareTo(o2.name);
				}
			}
			
		});
		for(Student q : list) {
			sb.append(q.name + " " + q.k + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}