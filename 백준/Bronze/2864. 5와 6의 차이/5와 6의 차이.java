

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		String o = st.nextToken();
		String oo = st.nextToken();
		String minA = "";
		String minB = "";
		String maxA = "";
		String maxB = "";
		for(char c : o.toCharArray()) {
			if(c == '6') {
				c = '5';
			}
			minA += c;
		}
		for(char c : oo.toCharArray()) {
			if(c == '6') {
				c = '5';
			}
			minB += c;
		}
		for(char c : o.toCharArray()) {
			if(c == '5') {
				c = '6';
			}
			maxA += c;
		}
		for(char c : oo.toCharArray()) {
			if(c == '5') {
				c = '6';
			}
			maxB += c;
		}
		sb.append((Integer.parseInt(minA) + Integer.parseInt(minB)) + " " + (Integer.parseInt(maxA) + Integer.parseInt(maxB)));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
