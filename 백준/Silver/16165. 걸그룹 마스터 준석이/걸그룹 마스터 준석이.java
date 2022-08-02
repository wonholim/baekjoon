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
		int b = Integer.parseInt(st.nextToken());
		Map<String, String> m = new HashMap<>();
		while(a --> 0) {
			String c = br.readLine();
			int d = Integer.parseInt(br.readLine());
			while(d --> 0) {
				String e = br.readLine();
				m.put(e, c);
			}
		}
		while(b --> 0) {
			ArrayList<String> list = new ArrayList<>();
			String f = br.readLine();
			int g = Integer.parseInt(br.readLine());
			if(g == 1) {
				sb.append(m.get(f)).append("\n");
			}else {
				for(String h : m.keySet()) {
					String i = m.get(h);
					if(i.equals(f)) {
						list.add(h);
					}
				}
				Collections.sort(list);
				for(String z : list) {
					sb.append(z).append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
