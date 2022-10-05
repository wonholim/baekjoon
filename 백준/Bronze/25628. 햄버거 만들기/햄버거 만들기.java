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
		int c = 0;
		if(a < 2 || b < 1) c = 0;
		else {
			a = a / 2;
			if(a > b) {
				c = b;
			}else if(a == b) {
				c = b;
			}else {
				c = a;
			}
		}
		sb.append(c);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
