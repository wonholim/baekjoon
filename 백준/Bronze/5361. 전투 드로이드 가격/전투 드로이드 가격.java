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
		double[] b = new double[5];
		b[0] = 350.34;
		b[1] = 230.90;
		b[2] = 190.55;
		b[3] = 125.30;
		b[4] = 180.90;
		StringTokenizer st;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			double sum = 0;
			for(int i = 0; i < 5; i++) {
				double c = Double.parseDouble(st.nextToken());
				sum = sum + (c * b[i]);
			}
			sb.append("$").append(String.format("%.2f", sum)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
