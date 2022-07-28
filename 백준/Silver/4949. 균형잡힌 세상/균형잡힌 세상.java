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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
//		while(!(st = new StringTokenizer(br.readLine(), " ")).equals(null)) {
		String b = null;
		while((b = br.readLine()) != null) {
			st = new StringTokenizer(b, "");
			String c = st.nextToken();
			if(c.equals(".")) break;
				for(int i = 0; i < c.length(); i++) {
					if(c.charAt(i) == '(') {
						stack.push('(');
					}else if(c.charAt(i) == '[') {
						stack.push('[');
					}else if(c.charAt(i) == ')') {
						if(stack.isEmpty()) {
							stack.push('(');
							break;
						}else {
							if(stack.pop() != '(') {
								stack.push('(');
								break;
							}
						}
					}else if(c.charAt(i) == ']'){
						if(stack.isEmpty()) {
							stack.push('[');
							break;
						}else {
							if(stack.pop() != '[') {
								stack.push('[');
								break;
							}
						}
					}
				}
			
			if(stack.isEmpty()) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
			stack.clear();
		}
		bw.append(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
