import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		long[] x = new long[a];
		long[] y = new long[a];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		double sum = 0;
		for(int i = 0; i < a; i++) {
			int j = i;
			if(j + 1 == a) j = -1;
			sum += (x[i] * y[j + 1]) - (x[j + 1] * y[i]);
		}
		sb.append(String.format("%.1f", (Math.abs(sum) / 2.0)));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
