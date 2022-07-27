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

		String a = st.nextToken();
		String b = st.nextToken();
		Stack<Character> s = new Stack<>();
		for(int j = 0; j < a.length(); j++) {
			s.push(a.charAt(j));
		}
		for(int j = 0; j < a.length(); j++) {
			sb.append(s.pop());
		}
		int c = Integer.parseInt(sb.toString());
		s.clear();
		sb.setLength(0);
		for(int j = 0; j < b.length(); j++) {
			s.push(b.charAt(j));
		}
		for(int j = 0; j < b.length(); j++) {
			sb.append(s.pop());
		}
		int d = Integer.parseInt(sb.toString());
		String e = Integer.toString(c + d);
		s.clear();
		sb.setLength(0);
		for(int i = 0; i < e.length(); i++) {
			s.push(e.charAt(i));
		}
		for(int i = 0; i < e.length(); i++) {
			sb.append(s.pop());
		}
		int g = Integer.parseInt(sb.toString());
		bw.write(Integer.toString(g));
		bw.flush();
		bw.close();
		br.close();
	}

}
