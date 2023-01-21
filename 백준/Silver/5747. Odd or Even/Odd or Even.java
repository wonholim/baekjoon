

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			int a_even = 0;
			int b_odd = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				if(Integer.parseInt(st.nextToken()) % 2 == 0) a_even++;
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				if(Integer.parseInt(st.nextToken()) % 2 != 0) b_odd++;
			}
			sb.append(Math.abs(a_even - b_odd) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
