

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<String, Double> m = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			double max = 0;
			while(a --> 0) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				double ki = Double.parseDouble(st.nextToken());
				m.put(name, ki);
				list.add(name);
				if(ki > max) max = ki;
			}
			for(String g : list) {
				if(m.get(g) >= max) {
					sb.append(g + " ");
				}
			}
			sb.append("\n");
			m.clear();
			list.clear();
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
