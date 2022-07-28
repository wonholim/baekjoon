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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String a = st.nextToken();
		int b = a.length() / 10;
		int c = a.length() % 10;
		for(int i = 0; i < b; i++) {
			for(int j = i * 10; j < 10 * (i + 1); j++) {
				sb.append(a.charAt(j));
			}
			sb.append("\n");
		}
		for(int i = 10 * b; i < (10 * b) + c; i++) {
			sb.append(a.charAt(i));
		}
		bw.append(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}