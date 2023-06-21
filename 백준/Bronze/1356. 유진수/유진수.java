
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] c = st.nextToken().toCharArray();
		int t = c.length - 1;
		int div = 1;
		while(t --> 0) {
			int a = c[0] - '0';
			int b = c[c.length - 1] - '0';
			for(int i = 1; i < div; i++) {
				a *= c[i] - '0';
			}
			for(int i = div; i < c.length - 1; i++) {
				b *= c[i] - '0';
			}
			if(a == b) {
				System.out.println("YES");
				return;
			}else div++;
		}
		sb.append("NO");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
