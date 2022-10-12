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
		StringTokenizer st;
		String a = "";
		double sum = 0;
		Map<String, Double> m = new HashMap<>();
		m.put("A+", 4.5); m.put("A0", 4.0); m.put("B+", 3.5); m.put("B0", 3.0);
		m.put("C+", 2.5); m.put("C0", 2.0); m.put("D+", 1.5); m.put("D0", 1.0);
		m.put("F", 0.0);
		double count = 0;
		while((a = br.readLine()) != null) {
			st = new StringTokenizer(a);
			st.nextToken();
			double h = Double.parseDouble(st.nextToken());
			String c = st.nextToken();
			if(!c.equals("P")) {
				count += h;
				sum += h * m.get(c);
			}
		}
		sb.append(String.format("%.6f", sum / count));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}