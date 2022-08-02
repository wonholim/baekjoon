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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> m = new HashMap<>();
		Set<Integer> s = new HashSet<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while(a --> 0) {
			int c = Integer.parseInt(st.nextToken());
			m.put(c, m.getOrDefault(c, 0) + 1);
			s.add(c);
		}
		st = new StringTokenizer(br.readLine());
		while(b --> 0) {
			int d = Integer.parseInt(st.nextToken());
			m.put(d, m.getOrDefault(d, 0) + 1);
			s.add(d);
		}
		Integer[] e = s.toArray(new Integer[0]);
		int count = 0;
		for(int k : e) {
			if(m.get(k) == 1) {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}