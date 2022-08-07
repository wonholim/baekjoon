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
		int m = 0;
		Stack<Integer> s = new Stack<>();
		while(a --> 0) {
			int c = Integer.parseInt(br.readLine());
			if(c > m) {
				while(m < c) {
					s.push(++m);
					sb.append("+").append("\n");
				}
				s.pop();
				sb.append("-").append("\n");
			}else {
				boolean found = false;
				if(!s.isEmpty()) {
					int top = s.peek();
					s.pop();
					sb.append("-").append("\n");
					if(top == c) {
						found = true;
					}
				}
				if(!found) {
					sb.setLength(0);
					sb.append("NO").append("\n");
					break;
				}
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
