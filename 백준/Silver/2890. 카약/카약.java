

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static class Jong implements Comparable<Jong>{
		int i;
		int j;
		public Jong(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public int compareTo(Jong o) {
			// TODO Auto-generated method stub
			return this.j - o.j;
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Jong> l = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String g = br.readLine();
			for(int j = 1; j <= m; j++) {
				if(g.charAt(j - 1) > '0' && g.charAt(j - 1) <= '9') {
					l.add(new Jong(g.charAt(j - 1) - '0', j));
					break;
				}
			}
		}
		Collections.sort(l, Collections.reverseOrder());
		int index = 1;
		Jong q = l.get(0);
		int[] c = new int[10];
		c[q.i] = index;
		for(int i = 1; i < l.size(); i++) {
			if(q.j == l.get(i).j) {
				c[l.get(i).i] = index;
			}else {
				q = l.get(i);
				c[l.get(i).i] = ++index;
			}
		}
		for(int i = 1; i < 10; i++) {
			sb.append(c[i] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
