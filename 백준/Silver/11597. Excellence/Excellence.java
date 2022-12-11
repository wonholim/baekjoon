

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		int[] c = new int[k];
		for(int i = 0; i < k; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c);
		int max = 999999999;
		int j = k - 1;
		for(int i = 0; i < k / 2; i++) {
			if(c[i] + c[j] < max) {
				max = c[i] + c[j];
			}
			j--;
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
