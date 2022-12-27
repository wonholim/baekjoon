

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Map<Long, Integer> m = new HashMap<>();
		ArrayList<Long> list = new ArrayList<>();
		long[] b = new long[4];
		for(int i = 0; i < 4; i++) {
			b[i] = Long.parseLong(st.nextToken());
		}
		int count = 0;
		while(a --> 0) {
			long sum = 0;
			count++;
			int c = Integer.parseInt(br.readLine()) - 1;
			st = new StringTokenizer(br.readLine());
			long g = Long.parseLong(st.nextToken());
			long k = Long.parseLong(st.nextToken());
			sum = Math.abs(b[0] - g) + Math.abs(b[1] - k);
			while(c --> 0) {
				st = new StringTokenizer(br.readLine());
				long d = Long.parseLong(st.nextToken());
				long e = Long.parseLong(st.nextToken());
				sum += Math.abs(g - d) + Math.abs(k - e);
				g = d;
				k = e;
			}
			sum += Math.abs(g - b[2]) + Math.abs(k - b[3]);
			list.add(sum);
			m.put(sum, count);
		}
		Collections.sort(list);
		sb.append(m.get(list.get(0)));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}

