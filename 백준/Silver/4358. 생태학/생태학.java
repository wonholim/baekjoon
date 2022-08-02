import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> m = new HashMap<>();
		Set<String> s = new HashSet<>();
		String a;
		double count = 0;
		while((a = br.readLine()) != null) {
			m.put(a, m.getOrDefault(a, 0) + 1);
			s.add(a);
			count++;
		}
		String[] str = s.toArray(new String[0]);
		Arrays.sort(str);
		for(String q : str) {
			double c = ((double)(m.get(q)) / count);

			sb.append(q).append(" ").append(String.format("%.4f", c * 100)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}