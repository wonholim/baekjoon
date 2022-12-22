

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), "*");
		String c0 = st.nextToken();
		String c1 = st.nextToken();
		while(t --> 0) {
			String l = br.readLine();
			String s = "";
			String la = "";
			if(c0.length() + c1.length() <= l.length()) {
			for(int i = 0; i < c0.length(); i++) {
				s += l.charAt(i);
			}
			for(int i = l.length() - c1.length(); i < l.length(); i++) {
				la += l.charAt(i);
			}
			}
			if(s.equals(c0) && la.equals(c1)) {
				sb.append("DA\n");
			}else {
				sb.append("NE\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
