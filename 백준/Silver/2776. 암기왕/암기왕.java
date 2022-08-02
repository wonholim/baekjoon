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
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			Map<Integer, Integer> m = new HashMap<>();
			int b = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			while(b --> 0) {
				int c = Integer.parseInt(st.nextToken());
				m.put(c, 1);
			}
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			while(e --> 0) {
				Integer q = Integer.parseInt(st.nextToken());
				if(m.get(q) == null) {
					sb.append("0").append("\n");
				}else {
					sb.append(m.get(q)).append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}