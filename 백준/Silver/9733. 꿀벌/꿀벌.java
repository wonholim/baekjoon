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
		Map<String, Integer> m = new HashMap<>();
		String a;
		double count = 0;
		while((a = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(a);
			while(st.hasMoreTokens()) {
				String t = st.nextToken();
				m.put(t, m.getOrDefault(t, 0) + 1);
				count++;
			}
		}
		String[] str = {"Re","Pt","Cc","Ea","Tb","Cm","Ex"};
		for(String q : str) {
			Integer k = m.get(q);
			if(k != null) {
				double c = ((double)k / count);
				sb.append(q).append(" ").append(m.get(q)).append(" ").append(String.format("%.2f", c)).append("\n");
			}else {
				sb.append(q).append(" ").append(0).append(" ").append("0.00").append("\n");
			}
		}
		sb.append("Total ").append((int)count).append(" 1.00");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
