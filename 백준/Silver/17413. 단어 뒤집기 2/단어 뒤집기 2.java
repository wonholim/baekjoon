import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<Character>();
		boolean check = false;
		String b = br.readLine();
		b = b + " ";
		for(char c : b.toCharArray()) {
			if(c == '<') {
				check = true;
				if(!s.isEmpty()) {
					while(!s.isEmpty()) {
						sb.append(s.pop());
					}
					s.clear();
				}
			}else if(c == '>') {
				check = false;
				sb.append('>');
				continue;
			}
			if(check != true && c != 32) {
				s.push(c);
			}else if(check == true) {
				sb.append(c);
			}else if((check != true && c == 32)) {
				while(!s.isEmpty()) {
					sb.append(s.pop());
				}
				sb.append(" ");
				s.clear();
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
