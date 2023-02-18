

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(st.nextToken()) + 1;
		String tmp = "";
		while(k != 0) {
			tmp += k % 2;
			k /= 2;
		}
		for(int i = tmp.length() - 2; i >= 0; i--) {
			if(tmp.charAt(i) == '0') sb.append("4");
			else sb.append("7");
		}
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
