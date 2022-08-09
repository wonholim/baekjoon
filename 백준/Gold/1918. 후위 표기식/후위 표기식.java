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
        String b = br.readLine();
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < b.length(); i++) {
        	char c = b.charAt(i);
        	if(c >= 'A' && c <= 'Z') {
        		sb.append(c);
        	}else if(c == '('){
        		s.push(c);
        	}else if(c == ')') {
        		while(!s.isEmpty()) {
        			char d = s.pop();
        			if(d == '(') break;
        			sb.append(d);
        		}
        	}else{ 
        		while(!s.isEmpty() && (priority(s.peek()) >= priority(c))) {
        			sb.append(s.pop());
        		}
        		s.push(c);
        	}
        }
        while(!s.isEmpty()) sb.append(s.pop());
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

	private static int priority(char c) {
		// TODO Auto-generated method stub
		if(c == '*' || c == '/')
			return 2;
		else if(c == '+' || c == '-')
			return 1;
		else 
		return 0;
	}

}
