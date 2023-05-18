
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
		int a = Integer.parseInt(st.nextToken());
		st.nextToken();
		int b= Integer.parseInt(st.nextToken());
		st.nextToken();
		int c = Integer.parseInt(st.nextToken());
		sb.append(a + b == c ? "YES" : "NO");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
