

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static class Para implements Comparable<Para>{
		double v;
		int i;
		public Para(double v, int i) {
			this.v = v;
			this.i = i;
		}
		@Override
		public int compareTo(Para o) {
			// TODO Auto-generated method stub
			if(this.v == o.v) {
				return this.i - o.i;
			}else {
				if(this.v > o.v) return 1;
				else if(this.v < o.v) return -1;
				else return 0;
			}
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		Map<Double, Integer> m = new HashMap<>();
		ArrayList<Para> list = new ArrayList<>();
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			double v = Double.parseDouble(st.nextToken());
			list.add(new Para(Math.sqrt((x * x) + (y * y)) / v, i));
		}
		Collections.sort(list);
		for(Para p : list) {
			sb.append(p.i + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
