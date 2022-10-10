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
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if(b <= a && a <= c) {
			sb.append(a);
		}else {
			int d = Math.abs(a - b);
			int e = Math.abs(a - c);
			if(d > e) {
				sb.append(c);
			}else {
				sb.append(b);
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
