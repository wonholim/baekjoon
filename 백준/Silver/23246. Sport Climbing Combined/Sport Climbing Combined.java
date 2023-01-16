

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
		int n;
		int i;
		int j;
		public Sorting(int n, int i, int j) {
			this.n = n;
			this.i = i;
			this.j = j;
		}
		@Override
		public int compareTo(Sorting o) {
			// TODO Auto-generated method stub
			if(this.i == o.i) {
				if(this.j == o.j) {
					return this.n - o.n;
				}
				return this.j - o.j;
			}
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
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			list.add(new Sorting(n, a * b * c, a + b + c));
		}
		Collections.sort(list);
		for(int i = 0; i < 3; i++) {
			sb.append(list.get(i).n + " ");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
