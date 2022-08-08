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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int m = 1;
		st = new StringTokenizer(br.readLine());
		Stack<Integer> s = new Stack<>();
		int ch = 0;
		while(a --> 0) {
			int c = Integer.parseInt(st.nextToken());
			if(!s.isEmpty()) ch = s.peek(); 
			if(m == c) {
				m++;
			}else if(ch == m) {
				s.pop();
				m++;
				if(!s.isEmpty()) ch = s.peek();
				else ch = -1;
				while(ch == m) {
					s.pop();
					m++;
					if(!s.isEmpty()) ch = s.peek();
					else ch = -1;
				}
				if(m == c) {
					m++;
				}else {
					s.push(c);
				}
			}else {
				s.push(c);
			}
		}
		while(!s.isEmpty()) {
			boolean found = false;
			int d = s.peek();
			if(d == m) {
				s.pop();
				m++;
				found = true;
			}
			if(!found) {sb.append("Sad"); break;}
		}
		if(s.isEmpty()) sb.append("Nice");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
