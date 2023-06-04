
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			pq.offer(Integer.parseInt(st.nextToken()));
		}
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		while(!pq.isEmpty()) {
			int size = m;
			if(pq.size() >= size) {
				while(size --> 0) {
					list.add(pq.poll());
				}
				sum += list.get(list.size() - 1);
				for (int i = 0; i < list.size() - 1; i++) {
					if(list.get(i) - list.get(list.size() - 1) > 0) {
						pq.offer(list.get(i) - list.get(list.size() - 1));
					}
				}
				list.clear();
			}else {
				sum += pq.peek();
				break;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
