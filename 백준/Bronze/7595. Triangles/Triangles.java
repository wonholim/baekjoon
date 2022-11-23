

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < i + 1; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
