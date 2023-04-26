
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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Map<String, Integer> m = new HashMap<>();
		int sum = 0;
		while(n --> 0) {
			String line = br.readLine();
			if(line.equals("ENTER")) {
				sum += m.size();
				m.clear();
				continue;
			}
			m.put(line, 1);
		}
		sb.append(sum + m.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
