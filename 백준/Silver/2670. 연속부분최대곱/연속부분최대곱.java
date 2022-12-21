

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		double[] c = new double[t];
		for(int i = 0; i < t; i++) {
			c[i] = Double.parseDouble(br.readLine());
		}
		double max = 0;
		for(int i = 0; i < t; i++) {
			double check = c[i];
			max = Math.max(max, check);
			for(int j = i + 1; j < t; j++) {
				check = check * c[j];
				max = Math.max(max, check);
			}
		}
		sb.append(String.format("%.3f", max));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
