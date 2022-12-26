

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			String line = br.readLine();
			if(line.equals("#")) break;
			Stack<Character> s = new Stack<>();
			for(char c : line.toCharArray()) {
				if(c == '(') {
					s.add(')');
				}else if(c == '[') {
					s.add(']');
				}else if(c == '{') {
					s.add('}');
				}else if(c == '}' || c == ']' || c == ')') {
					if(s.isEmpty()) {
						break;
					}else {
						if(s.peek() == c) {
							s.pop();
						}else {
							break;
						}
					}
				}
			}
			if(s.isEmpty()) sb.append("Legal\n");
			else sb.append("Illegal\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
