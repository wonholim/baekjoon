

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		sb.append((a + b) - (Math.sqrt(a * a + b * b)));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
