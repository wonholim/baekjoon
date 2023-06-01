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
		Map<String, PriorityQueue<Integer>> m = new HashMap<>();
		long sum = 0;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int select = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int i = Integer.parseInt(st.nextToken());
			if(select == 1) {
				if(m.get(name) == null) {
					m.put(name, new PriorityQueue<>(Collections.reverseOrder()));
				}
				while(i --> 0) {
					m.get(name).offer(Integer.parseInt(st.nextToken()));
				}
			} else {
				if(m.get(name) == null) continue;
				while(i --> 0) {
					if(m.get(name).isEmpty()) break;
					sum += m.get(name).poll();
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
