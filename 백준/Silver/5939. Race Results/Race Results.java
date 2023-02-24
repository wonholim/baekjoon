

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Sorting implements Comparable<Sorting>{
		int t, m, s;
		
		public Sorting(int t, int m, int s) {
			this.t = t;
			this.m = m;
			this.s = s;
		}
		@Override
		public int compareTo(Sorting o) {
			// TODO Auto-generated method stub
			if(this.t == o.t) {
				if(this.m == o.m) {
					return this.s - o.s;
				}
				return this.m - o.m;
			}
			return this.t - o.t;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayList<Sorting> list = new ArrayList<>();
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			int t3 = Integer.parseInt(st.nextToken());
			list.add(new Sorting(t1, t2, t3));
		}
		Collections.sort(list);
		for(Sorting s : list) {
			sb.append(s.t + " " + s.m + " " + s.s + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
