
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String a = br.readLine();
		Stack<Integer> s = new Stack<>();
		int sum = 0;
		boolean check = false;
		for(char c : a.toCharArray()) {
			if(c == '(') {
				s.push(-1);
			}else if(c == ')') {
				while(!s.isEmpty()) {
					int g = s.pop();
					if(g != -1) {
						sum += g;
					}else {
						s.push(sum);
						sum = 0;
						break;
					}
				}
			}else if(c == 'H') {
				s.push(1);
			}else if(c == 'C') {
				s.push(12);
			}else if(c == 'O') {
				s.push(16);
			}else if(c > '1' && c <= '9') {
				s.push(s.pop() * (c - '0'));
			}
		}
		while(!s.isEmpty()) sum += s.pop();
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
