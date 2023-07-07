import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		PriorityQueue<Long> pq = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		while (n --> 0) {
			pq.offer(Long.parseLong(st.nextToken()));
		}
		while (m --> 0) {
			long a = pq.poll() + pq.poll();
			pq.offer(a);
			pq.offer(a);
		}
		
		long sum = 0;
		while (!pq.isEmpty()) sum += pq.poll();
		
		System.out.println(sum);
	}

}