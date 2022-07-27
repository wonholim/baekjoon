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
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String b = st.nextToken();
				Stack<Character> q = new Stack<>();
				for(int i = 0; i < b.length(); i++) {
					q.push(b.charAt(i));
				}
				for(int i = 0; i < b.length(); i++) {
					sb.append(q.pop());
				}
				sb.append(" ");
			}
			sb.append("\n");
			
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
