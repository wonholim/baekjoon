

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Character> s = new Stack<>();
		for(char c : st.nextToken().toCharArray()) {
			if(s.isEmpty()) s.push(c);
			else {
				if(s.peek() != c) {
					s.push(c);
				}
			}
		}
		while(!s.isEmpty()) sb.append(s.pop());
		sb.reverse();
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
