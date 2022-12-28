

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
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int j = 1;
		while(t --> 0) {
			Deque<Integer> dq = new ArrayDeque<>();
			st = new StringTokenizer(br.readLine());
			int t2 = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
			Integer[] c = new Integer[t2];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < t2; i++) {
				c[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(c, Collections.reverseOrder());
			for(int i = 0; i < t2; i++) {
				dq.offer(c[i]);
			}
			int k = c.length - 1;
			int count = 0;
			while(!dq.isEmpty()) {
				if(dq.size() != 1) {
					if(dq.peekFirst() + dq.peekLast() <= max) {
						dq.pollFirst();
						dq.pollLast();
						count++;
					}else {
						dq.pollFirst();
						count++;
					}
				}else {
					dq.poll();
					count++;
				}
			}
			sb.append("Case #" + j + ": " + count + "\n");
			j++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
