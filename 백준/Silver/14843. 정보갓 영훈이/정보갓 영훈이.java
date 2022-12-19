

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		double sum = 0;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			double s = Double.parseDouble(st.nextToken());
			double a = Double.parseDouble(st.nextToken());
			double tt = Double.parseDouble(st.nextToken());
			double m = Double.parseDouble(st.nextToken());
			double sa = 1 + (1 / a);
			double stm = 1 + (m / tt);
			sum += (s * sa * stm) / 4;
		}
		t = Integer.parseInt(br.readLine());
		Double[] c = new Double[t + 1];
		for(int i = 0; i < t; i++) {
			c[i] = Double.parseDouble(br.readLine());
		}
		c[t] = sum;
		Arrays.sort(c, Collections.reverseOrder());
		int index = -1;
		for(int i = 0; i < t + 1; i++) {
			if(c[i] == sum) {
				index = i;
				break;
			}
		}
		double per = ((double)(index + 1) / (t + 1)) * 100;
		if(per <= 15) sb.append("The total score of Younghoon \"The God\" is " + String.format("%.2f", sum) + ".");
		else sb.append("The total score of Younghoon is " + String.format("%.2f", sum) + ".");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
