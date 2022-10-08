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
		int p = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(Integer.toString(c) + Integer.toString(p));
		for(int i = 2; i < c; i++) {
			if(p % i == 0) {
				System.out.println("No");
				return;
			}
		}
		for(int i = 2; i < p; i++) {
			if(p % i == 0) {
				System.out.println("No");
				return;
			}
		}
		for(int i = 2; i < d; i++) {
			if(d % i == 0) {
				System.out.println("No");
				return;
			}
		}
		sb.append("Yes");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
