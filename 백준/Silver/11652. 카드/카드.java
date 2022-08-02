import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		Map<Long, Integer> m = new HashMap<>();
		Set<Long> s = new HashSet<>();
		while(a --> 0) {
			long b = Long.parseLong(br.readLine());
			m.put(b, m.getOrDefault(b, 0) + 1);
			s.add(b);
		}
		long max = 0;
		Long[] c = s.toArray(new Long[0]);
		Arrays.sort(c);
		long d = 0;
		for(long g : c) {
			if(m.get(g) > max) {
				max = m.get(g);
				d = g;
			}
		}
		sb.append(d);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
