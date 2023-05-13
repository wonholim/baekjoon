
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		long sum = 0L;
		while(k --> 0) {
			String query = br.readLine();
			if(query.charAt(0) == '+') {
				sum += Long.parseLong(query.substring(1));
			} else {
				sum -= Long.parseLong(query.substring(1));
			}
			
			if(sum == 0) {
				sb.append("0\n");
				continue;
			}
			long m = 0;
			for(int i = 62; i >= 0; i--) {
				m = 1L << i;
				if((sum & m) == m) break;
			}
			sb.append(m + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
