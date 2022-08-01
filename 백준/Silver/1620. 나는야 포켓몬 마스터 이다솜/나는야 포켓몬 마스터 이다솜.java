import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		int e = Integer.parseInt(st.nextToken());
		Map<String, Integer> m = new HashMap<>();
		String[] g = new String[a];
		for(int i = 1; i <= a; i++) {
			String b = br.readLine();
			g[i - 1] = b;
			m.put(b, i);
		}
		while(e --> 0) {
			String c = br.readLine();
			if(m.get(c) == null) {
				int q = Integer.parseInt(c);
				sb.append(g[q - 1]).append("\n");
			}else {
				sb.append(m.get(c)).append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
