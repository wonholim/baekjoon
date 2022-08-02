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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		while(a --> 0) {
			String c = br.readLine();
			m.put(c, m.getOrDefault(c, 0) + 1);
			s.add(c);
		}
		while(b --> 0) {
			String d = br.readLine();
			m.put(d, m.getOrDefault(d, 0) + 1);
			s.add(d);
		}
		String[] e = s.toArray(new String[0]);
		s.clear();
		int count = 0;
		for(String k : e) {
			if(m.get(k) == 2) {
				s.add(k);
				count++;
			}
		}
		String[] q = s.toArray(new String[0]);
		Arrays.sort(q);
		sb.append(count).append("\n");
		for(String f : q) {
			sb.append(f).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}