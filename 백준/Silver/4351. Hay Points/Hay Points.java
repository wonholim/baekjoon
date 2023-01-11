

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
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		Map<String, Double> m = new HashMap<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			double b = Double.parseDouble(st.nextToken());
			m.put(a, b);
		}
		while(t --> 0) {
			double sum = 0;
			while(true) {
				String k = br.readLine();
				if(k.equals(".")) break;
				st = new StringTokenizer(k);
				while(st.hasMoreTokens()) {
					String q = st.nextToken();
					if(m.get(q) != null) sum += m.get(q);
				}
			}
			sb.append((int)sum + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
