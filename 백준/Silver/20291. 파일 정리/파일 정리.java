import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
		int a = Integer.parseInt(st.nextToken());
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		while(a --> 0) {
			st = new StringTokenizer(br.readLine(), ".");
			st.nextToken();
			String b = st.nextToken();
			s.add(b);
			m.put(b, m.getOrDefault(b, 0) + 1);
		}
		List<String> list = new ArrayList<String>(s);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(" ").append(m.get(list.get(i))).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
