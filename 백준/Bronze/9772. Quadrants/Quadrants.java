
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String b = "";
		while ((b = br.readLine()) != null) {
			st = new StringTokenizer(b);
			double n = Double.parseDouble(st.nextToken());
			double k = Double.parseDouble(st.nextToken());
			if(n == 0 || k == 0) {
				sb.append("AXIS\n");
			}else if(n > 0 && k > 0) {
				sb.append("Q1\n");
			}else if(n > 0 && k < 0) {
				sb.append("Q4\n");
			}else if(n < 0 && k > 0) {
				sb.append("Q2\n");
			}else {
				sb.append("Q3\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
