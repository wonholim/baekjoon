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
		StringTokenizer st = new StringTokenizer(br.readLine(), "");
		StringBuilder sb = new StringBuilder();
		String start = st.nextToken();
		Stack<Character> s = new Stack<>();
		int count = 0;
		for(int i = 0; i < start.length(); i++) {
			if(start.charAt(i) == '(') {
				s.push('(');
			}else {
				if(s.isEmpty()) {count++;}
				else { s.pop(); }
			}
		}
		while(!s.isEmpty()) {
			s.pop();
			count++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
