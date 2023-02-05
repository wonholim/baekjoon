

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int count = 1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Set<Integer> s = new HashSet<>();
		s.add(Integer.parseInt(st.nextToken()));
		s.add(Integer.parseInt(st.nextToken()));
		s.add(Integer.parseInt(st.nextToken()));
		for(int i = 1; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int q = (Integer.parseInt(st.nextToken()));
			int w = (Integer.parseInt(st.nextToken()));
			int e = (Integer.parseInt(st.nextToken()));
			if(!(s.contains(q) || s.contains(w) || s.contains(e))) count++;
			s.add(q);
			s.add(w);
			s.add(e);
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
