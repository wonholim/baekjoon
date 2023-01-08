

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			double sum = 0;
			int t2 = Integer.parseInt(br.readLine());
			while(t2 --> 0) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				int a = Integer.parseInt(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				sum += a * b;
			}
			sb.append("$" + String.format("%.2f", sum) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
