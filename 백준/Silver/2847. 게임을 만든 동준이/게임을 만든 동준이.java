

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] c = new int[t];
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;
		for(int i = t - 2; 0 <= i; i--) {
			if(c[i + 1] <= c[i]) {
				count += (c[i] - c[i + 1]) + 1;
				c[i] = c[i] - ((c[i] - c[i + 1]) + 1);
			} 
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
