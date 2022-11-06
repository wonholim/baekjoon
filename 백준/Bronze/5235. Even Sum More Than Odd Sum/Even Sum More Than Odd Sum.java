
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
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int odd = 0;
			int even = 0;
			while(b --> 0) {
				int k = Integer.parseInt(st.nextToken());
				if(k % 2 == 0) {
					even += k;
				}else {
					odd += k;
				}
			}
			if(odd > even) {
				sb.append("ODD\n");
			}else if(even > odd) {
				sb.append("EVEN\n");
			}else {
				sb.append("TIE\n");
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
