

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
		String s = st.nextToken();
		int zero = 0;
		int one = 0;
		for(char c : s.toCharArray()) {
			if(c == '0') zero++;
			else one++;
		}
		int t_zero = zero / 2;
		int t_one = one / 2;
		String line = "";
		for(char c : s.toCharArray()) {
			if(c == '1' && t_one != 0) {t_one--; continue;}
			else if(c == '1' &&  t_one == 0) {line += c;}
			else if(c == '0' && t_zero != 0) {
				line += c;
				t_zero--;
			}
			
		}
		sb.append(line);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
