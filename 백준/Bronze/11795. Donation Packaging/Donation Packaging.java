

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
		int k = Integer.parseInt(br.readLine());
		int[] c = new int[3];
		while(k --> 0) {
			st = new StringTokenizer(br.readLine());
			int tmp = Integer.MAX_VALUE;
			for(int i = 0; i < 3; i++) {
				c[i] = c[i] + Integer.parseInt(st.nextToken());
				tmp = Math.min(tmp, c[i]);
			}
			if(tmp < 30) sb.append("NO");
			else {
				sb.append(tmp);
				for(int i = 0; i < 3; i++) {
					c[i] = c[i] - tmp;
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
