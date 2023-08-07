import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
		int n = Integer.parseInt(br.readLine());
		while (n --> 0) {
			double k = Double.parseDouble(br.readLine());
			if (pq.size() == 7 && pq.peek() > k) {
				pq.poll();
				pq.offer(k);
			} else if (pq.size() < 7) {
				pq.offer(k);
			}
		}
		pq.stream().sorted().map(i -> String.format("%.3f", i)).forEach(System.out::println);
	}
}