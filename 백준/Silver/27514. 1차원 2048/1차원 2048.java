
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Long> pq = new PriorityQueue<>();
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long max = 0;
		while(k --> 0) {
			pq.offer(Long.parseLong(st.nextToken()));
			
		}
		while(!pq.isEmpty()) {
			max = Math.max(max, pq.peek());
			if(pq.size() == 1) break;
			long i = pq.poll();
			long j = pq.poll();
			if(i == j) {
				pq.offer(i + j);
				
			}else {
				pq.offer(j);
			}
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
