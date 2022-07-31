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
		int b = Integer.parseInt(st.nextToken());
		Map<String, Integer> m = new HashMap<>();
		String[] e = new String[a];
		int i = 0;
		while(a --> 0) {
			String c = br.readLine();
			e[i] = c;
			m.put(c, 0);
			i++;
		}
		while(b --> 0) {
			String d = br.readLine();
			m.put(d, m.getOrDefault(d, 0) + 1);
		}
		int sum = 0;
		for(int s = 0; s < e.length; s++) {
			sum = sum + m.get(e[s]);
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}