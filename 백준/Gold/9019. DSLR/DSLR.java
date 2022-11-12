

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			boolean[] d = new boolean[10000];
			int[] c = new int[10000];
			Map<Integer, Character> m = new HashMap<>();
			Queue<Integer> q = new ArrayDeque<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			d[start] = true;
			q.offer(start);
			while(!q.isEmpty()) {
				int g = q.poll();
				if(g == end) {
					break;
				}
				int dd = g * 2;
				dd = dd % 10000;
				int ss = g - 1;
				if(ss < 0) ss = 9999;
				if(!d[dd]) {
					d[dd] = true;
					c[dd] = g;
					m.put(dd, 'D');
					q.offer(dd);
				}
				if(!d[ss]) {
					d[ss] = true;
					c[ss] = g;
					m.put(ss, 'S');
					q.offer(ss);
				}
				int llll = ((g * 10) % 10000 + (g / 1000));
				if(!d[llll]) {
					d[llll] = true;
					c[llll] = g;
					m.put(llll, 'L');
					q.offer(llll);
				}
				int rrrr = ((g % 10) * 1000 + (g / 10));
				if(!d[rrrr]) {
					d[rrrr] = true;
					c[rrrr] = g;
					m.put(rrrr, 'R');
					q.offer(rrrr);
				}
			}
			StringBuilder sb1 = new StringBuilder();
			while(end != start) {
				sb1.append(m.get(end));
				end = c[end];
			}
			sb.append(sb1.reverse() + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
