

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		while(t --> 0) {
			PriorityQueue<Long> pq = new PriorityQueue<>();
			int t1 = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			while(t1 --> 0) {
				pq.offer((long) Integer.parseInt(st.nextToken()));
			}
			long sum = 0;
			while(!pq.isEmpty()) {
				if(pq.size() == 1) break;
				long k = pq.poll();
				long j = pq.poll();
				sum += k + j;
				pq.offer(k + j);
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}


}
