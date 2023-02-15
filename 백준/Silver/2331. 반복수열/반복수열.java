

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Set<Integer> s = new HashSet<>();
		Set<Integer> list  = new HashSet<>();
		s.add(a);
		int count = 0;
		while(true) {
			String[] k = Integer.toString(a).split("");
			a = 0;
			for(int i = 0; i < k.length; i++) {
				a += Math.pow(Integer.parseInt(k[i]), b);
			}
			if (count == 100) break;
			if(s.contains(a)) {
				list.add(a);
				count++;
			}
			else s.add(a);
		}
		sb.append(s.size() - list.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
