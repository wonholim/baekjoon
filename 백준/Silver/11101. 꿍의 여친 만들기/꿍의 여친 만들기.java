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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		while(a --> 0) {
			Map<String, Integer> m = new HashMap<>();
			ArrayList<Integer> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine(), ",");
			while(st.hasMoreTokens()) {
				String b = st.nextToken();
				StringTokenizer st1 = new StringTokenizer(b, ":");
				String q = st1.nextToken();
				int c = Integer.parseInt(st1.nextToken());
				m.put(q, c);
			}
			st = new StringTokenizer(br.readLine(), "|");
			while(st.hasMoreTokens()) {
				int max = -1;
				String t = st.nextToken();
				StringTokenizer st1 = new StringTokenizer(t, "&");
				while(st1.hasMoreTokens()){
					String g = st1.nextToken();
					if(m.get(g) > max) {
						max = m.get(g);
					}
				}
				list.add(max);
			}
			Collections.sort(list);
			sb.append(list.get(0)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
