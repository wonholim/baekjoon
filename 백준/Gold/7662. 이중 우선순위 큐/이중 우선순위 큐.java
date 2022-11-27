

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main {
	static PriorityQueue<Integer> up;
	static PriorityQueue<Integer> down;
	static Map<Integer, Integer> m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			m = new HashMap<>();
			up = new PriorityQueue<>(Collections.reverseOrder());
			down = new PriorityQueue<>();
			int t1 = Integer.parseInt(br.readLine());
			while(t1 --> 0) {
				st = new StringTokenizer(br.readLine());
				String inst = st.nextToken();
				int k = Integer.parseInt(st.nextToken());
				if(inst.equals("I")) {
					up.offer(k);
					down.offer(k);
					m.put(k, m.getOrDefault(k, 0) + 1);
				}else if(inst.equals("D")) {
					if(k == 1) {
						while(!up.isEmpty()) {
							int tmp = up.poll();
							if(m.get(tmp) == null) {
								continue;
							}else {
								m.put(tmp, m.getOrDefault(tmp, m.get(tmp)) - 1);
								if(m.get(tmp) == 0) {
									m.remove(tmp);
								}
								break;
							}
						}
					}else {
						while(!down.isEmpty()) {
							int tmp = down.poll();
							if(m.get(tmp) == null) {
								continue;
							}else {
								m.put(tmp, m.getOrDefault(tmp, m.get(tmp)) - 1);
								if(m.get(tmp) == 0) {
									m.remove(tmp);
								}
								break;
							}
						}
					}
				}
			}
			while(!up.isEmpty()) {
				int tmp = up.peek();
				if(m.get(tmp) == null) {
					up.poll();
				}else if(m.get(tmp) == 0){
					m.remove(tmp);
				}else {
					break;
				}
			}
			while(!down.isEmpty()) {
				int tmp = down.peek();
				if(m.get(tmp) == null) {
					down.poll();
				}else if(m.get(tmp) == 0){
					m.remove(tmp);
				}else {
					break;
				}
			}
			if(m.isEmpty()) sb.append("EMPTY\n");
			else sb.append(up.poll() + " " + down.poll() + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
