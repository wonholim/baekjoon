

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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		if(t == 1) {
			System.out.println(0);
			return;
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < t; i++) {
			pq.offer(Integer.parseInt(br.readLine()));
		}
		long sum = 0;
		while(pq.size() != 1) {
			int k = pq.poll() + pq.poll();
			sum += k;
			pq.offer(k);
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
