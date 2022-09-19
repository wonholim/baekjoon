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
		while(true) {
			double a = Double.parseDouble(br.readLine());
			if(a == 0) break;
				double sum = 0;
				sum += 1;
				sum += a;
				sum += Math.pow(a, 2);
				sum += Math.pow(a, 3);
				sum += Math.pow(a, 4);
				sb.append(String.format("%.2f", sum) + "\n");
			}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
