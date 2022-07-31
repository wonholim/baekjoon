import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		Map<String, String> m = new HashMap<>();
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			String d = st.nextToken();
			if(d.equals("enter")) m.put(c, d);
			else m.remove(c);
		}
		String[] g = new String[m.size()];
		int i = 0;
		for(String z : m.keySet()) {
			g[i] = z;
			i++;
		}
		Arrays.sort(g, Collections.reverseOrder());
		for(String q : g) {
			sb.append(q).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
