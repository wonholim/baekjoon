

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
		String k = br.readLine();
		Stack<Character> s = new Stack<>();
		for(char c : k.toCharArray()) {
			if(c == '*') break;
			else if(c == '(') s.add('(');
			else {
				if(!s.isEmpty()) s.pop();
			} 
		}
		sb.append(s.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
