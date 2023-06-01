
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		PriorityQueue<Long>[] pq = new PriorityQueue[100001];
		for(int i = 1; i <= 100000; i++) {
			pq[i] = new PriorityQueue<>(Collections.reverseOrder());
		}
		Map<String, Integer> m = new HashMap<>();
		int count = 1;
		long sum = 0;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int select = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int i = Integer.parseInt(st.nextToken());
			if(select == 1) {
				if(m.get(name) == null) {
					m.put(name, count++);
				}
				while(i --> 0) {
					pq[m.get(name)].offer(Long.parseLong(st.nextToken()));
				}
			} else {
				if(m.get(name) == null) continue;
				while(i --> 0) {
					if(pq[m.get(name)].isEmpty()) break;
					sum += pq[m.get(name)].poll();
				}
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
