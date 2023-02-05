

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static Stack<Character> s;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int i = 1;
		while (true) {
			String k = br.readLine();
			if (k.charAt(0) == '-') break;
			s = new Stack<>();
			count = 0;
			for (char c : k.toCharArray()) {
				if(!s.isEmpty()) {
					if((s.peek() == '{') && c == '}') {
						s.pop();
					}else {
						s.push(c);
					}
				}else {
					s.push(c);
				}
			}
			while(!s.isEmpty()) {
				char a = s.pop();
				char b = s.pop();
				if (b != a) {
					count += 2;
				} else {
					count += 1;
				}
			}
			sb.append(i + ". " + count + "\n");
			i++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
