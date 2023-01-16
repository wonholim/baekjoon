

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
	static class Sorting implements Comparable<Sorting>{
		char n;
		int i;
		public Sorting(char n, int i) {
			this.n = n;
			this.i = i;
		}
		@Override
		public int compareTo(Sorting o) {
			// TODO Auto-generated method stub
			return this.i - o.i;
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		ArrayList<Sorting> list = new ArrayList<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String k = st.nextToken();
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			char c;
			c = k.charAt(j - 1);
			if(c >= 'a' && c <= 'z') {
				c = (char) (c - 32);
			}
			list.add(new Sorting(c, i));
		}
		Collections.sort(list);
		for(Sorting s : list) sb.append(s.n);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
