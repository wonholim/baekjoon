import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		int a = Integer.parseInt(st.nextToken());
		int b = a - 1;
		while(a --> 0) {
			String t = br.readLine();
			m.put(t, m.getOrDefault(t, 0) + 1);
			s.add(t);
		}
		while(b --> 0) {
			String t = br.readLine();
			m.put(t, m.getOrDefault(t, 0) + 1);
			s.add(t);
		}
		String[] str = s.toArray(new String[0]);
		for(String q : str) {
			if(m.get(q) % 2 != 0) {
				sb.append(q);
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}