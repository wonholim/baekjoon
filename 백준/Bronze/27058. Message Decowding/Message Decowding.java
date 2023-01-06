

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<Character, Character> m = new HashMap<>();
		char d = 'a';
		for(char c : br.readLine().toCharArray()) {
			m.put(d, c);
			d++;
		}
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				sb.append((char)(m.get((char)(c + 32)) - 32));
			}else if(c != ' ') {
				sb.append(m.get(c));
			}else {
				sb.append(' ');
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
