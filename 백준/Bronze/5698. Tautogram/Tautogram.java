

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
		StringTokenizer st;
		while(true) {
			String k = br.readLine();
			if(k.equals("*")) break;
			k = k.toLowerCase();
			st = new StringTokenizer(k);
			char c = k.charAt(0);
			boolean check = false;
			while(st.hasMoreTokens()) {
				if(st.nextToken().charAt(0) != c) {
					check = true;
					break;
				}
			}
			if(check) sb.append("N\n");
			else sb.append("Y\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
