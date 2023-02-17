

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Sing implements Comparable<Sing>{
		int i;
		double s;
		public Sing(int i, double s) {
			this.i = i;
			this.s = s;
		}
		@Override
		public int compareTo(Sing o) {
			// TODO Auto-generated method stub
			if(this.s == o.s) {
				return this.i - o.i;
			}
			if(this.s > o.s) return -1;
			return 1;
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Sing> list = new ArrayList<>();
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				int j = Integer.parseInt(st.nextToken());
				double l = Double.parseDouble(st.nextToken());
				list.add(new Sing(j, l));
			}
		}
		Collections.sort(list);
		double sum = 0;
		boolean[] c = new boolean[n + 1];
		int i = -1;
		while(k > 0) {
			i++;
			if(c[list.get(i).i]) continue;
			c[list.get(i).i] = true;
			sum += list.get(i).s;
			k--;
		}
		sb.append(String.format("%.1f", sum));
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
