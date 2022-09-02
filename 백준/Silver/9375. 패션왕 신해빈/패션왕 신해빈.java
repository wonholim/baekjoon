import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
		StringTokenizer st;
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int sum = 1;
			int d = Integer.parseInt(br.readLine());
			while(d --> 0) {
				st = new StringTokenizer(br.readLine());
				String b = st.nextToken();
				String c = st.nextToken();
				m.put(c, m.getOrDefault(c, 0) + 1);
				s.add(c);
			}
			for(String e : s) {
				int k = m.get(e);
				if(k > 0) {
					sum = sum * (k + 1);
				}
			}
			sum--;
			m.clear();
			s.clear();
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}