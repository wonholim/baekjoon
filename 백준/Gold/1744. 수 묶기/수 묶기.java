

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	static PriorityQueue<Long> pq_up = new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue<Long> pq_down = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			long check = Long.parseLong(br.readLine());
			if(check > 0) pq_up.offer(check);
			else pq_down.offer(check);
		}
		long sum = 0;
		while(!pq_up.isEmpty()) {
			long first = pq_up.poll();
			if(first == 1) {sum += 1; continue;}
			if(!pq_up.isEmpty()) {
				if(first != 1 && pq_up.peek() == 1) {
					sum += first;
				}else {
					sum += first * pq_up.poll();
				}
			}else {
				sum += first;
			}
		}
		while(!pq_down.isEmpty()) {
			long first = pq_down.poll();
			if(!pq_down.isEmpty()) {
				if(first != 0 && pq_down.peek() == 0) {
					pq_down.poll();
				}else {
					sum += first * pq_down.poll();
				}
			}else {
				sum += first;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
