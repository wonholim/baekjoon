

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i = 1; i <= n; i++) {
			dq.offer(i);
		}
		Map<Integer, Integer> m = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				dq.offer(dq.poll());
			}
			m.put(dq.poll(), i);
		}
		for(int i = 1; i <= n; i++) {
			sb.append(m.get(i) + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
