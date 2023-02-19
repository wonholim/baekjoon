

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			double tmp = Double.parseDouble(st.nextToken());
			String k = st.nextToken();
			if(k.equals("kg")) {
				sb.append(String.format("%.4f", tmp * 2.2046) + " lb\n");
			}else if(k.equals("l")) {
				sb.append(String.format("%.4f", tmp * 0.2642) + " g\n");
			}else if(k.equals("lb")) {
				sb.append(String.format("%.4f", tmp * 0.4536) + " kg\n");
			}else {
				sb.append(String.format("%.4f", tmp * 3.7854) + " l\n");
			}
		}
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
