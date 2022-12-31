

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Score implements Comparable<Score>{
		int i;
		int g;
		int s;
		int b;
		public Score(int i, int g, int s, int b) {
			this.i = i;
			this.g = g;
			this.s = s;
			this.b = b;
		}
		@Override
		public int compareTo(Score o) {
			// TODO Auto-generated method stub
			if(this.g == o.g) {
				if(this.s == o.s) {
					return o.b - this.b;
				}else {
					return o.s - this.s;
				}
			}else {
				return o.g - this.g;
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
		int index = Integer.parseInt(st.nextToken());
		ArrayList<Score> list = new ArrayList<>();
		while(t --> 0) {
			 st = new StringTokenizer(br.readLine());
			 int i = Integer.parseInt(st.nextToken());
			 int g = Integer.parseInt(st.nextToken());
			 int s = Integer.parseInt(st.nextToken());
			 int b = Integer.parseInt(st.nextToken());
			 list.add(new Score(i, g, s, b));
		}
		Collections.sort(list);
		int start = 1;
		Score s = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			Score g = list.get(i);
			if(s.g != g.g || s.s != g.s || s.b != g.b) {
				start = i + 1;
				s.g = g.g;
				s.s = g.s;
				s.b = g.b;
			}
			if(g.i == index) {
				sb.append(start + "\n");
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
