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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		Stack<String> s = new Stack<>();
		int count = 1;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String c = st.nextToken();
				s.push(c);
			}
			sb.append("Case #").append(count).append(": ");
			while(!s.isEmpty()) {
				sb.append(s.pop()).append(" ");
			}
			sb.append("\n");
			s.clear();
			count++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
