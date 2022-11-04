
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
		String a = br.readLine();
		if(a.length() % 2 != 0) {System.out.println(0); return;}
		Stack<Integer> s = new Stack<>();
		int sum = 0;
		for(char c : a.toCharArray()) {
			sum = 0;
			if(c == '(') {
				s.push(-1);
			}else if(c == '[') {
				s.push(-2);
			}else if(c == ']') {
				if(s.isEmpty() || s.peek() == -1) {System.out.println(0); return;}
				int k = s.pop();
				if(k == -2) {
					s.push(3);
				}else {
					while(k != -2) {
						sum += k;
						if(!s.isEmpty()) {
							k = s.pop();
						}else {
							System.out.println(0); return;
						}
					}
					sum = sum * 3;
					s.push(sum);
				}
			}else if(c == ')') {
				if(s.isEmpty() || s.peek() == -2) {System.out.println(0); return;}
				int k = s.pop();
				if(k == -1) {
					s.push(2);
				}else {
					while(k != -1) {
						sum += k;
						if(!s.isEmpty()) {
							k = s.pop();
						}else {
							System.out.println(0); return;
						}
					}
					sum = sum * 2;
					s.push(sum);
				}
			}
		}
		sum = 0;
		while(!s.isEmpty()) {
			int k = s.pop();
			if(k != -1 && k != -2) {
				sum += k;
			}else {
				System.out.println(0); return;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
