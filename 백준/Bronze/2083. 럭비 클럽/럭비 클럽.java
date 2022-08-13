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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(true) {
			String a = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a.equals("#") && b == 0 && c == 0) break;
			if(b > 17 || c >= 80) {
				sb.append(a).append(" Senior").append("\n");
			}else {
				sb.append(a).append(" Junior").append("\n");
			}
			st = new StringTokenizer(br.readLine());
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
