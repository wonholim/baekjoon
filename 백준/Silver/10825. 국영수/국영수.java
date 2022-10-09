import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static class Student{
		String name;
		int kor;
		int eng;
		int math;
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}

	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		ArrayList<Student> list = new ArrayList<>();
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			list.add(new Student(name, kor, eng, math));
		}
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.kor != o2.kor) {
					return o2.kor - o1.kor;
				}else {
					if(o1.eng != o2.eng) {
						return o1.eng - o2.eng;
					}else {
						if(o1.math != o2.math) {
							return o2.math - o1.math;
						}else {
							return o1.name.compareTo(o2.name);
						}
					}
				}
			}
		});
		for(Student s : list) {
			sb.append(s.name + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}