
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
			long n = Integer.parseInt(st.nextToken());
			long k = Integer.parseInt(st.nextToken());
			long sum = n;
			while(n / k > 0) {
				sum += n / k;
				n = n / k + n % k;
			}
			System.out.println(sum);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
