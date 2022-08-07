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
		String b = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		Stack<Character> s = new Stack<>();
		Stack<Character> s1 = new Stack<>();
		for(char c : b.toCharArray()) s.push(c);
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			String d = st.nextToken();
			if(d.equals("L")) {
				if(!s.isEmpty())
				s1.push(s.pop());
			}else if(d.equals("D")) {
				if(!s1.isEmpty())
				s.push(s1.pop());
			}else if(d.equals("B")) {
				if(!s.isEmpty())
				s.pop();
			}else if(d.equals("P")) {
				String e = st.nextToken();
				char[] k = e.toCharArray();
				s.push(k[0]);
			}
		}
		char[] q = new char[s.size()];
		for(int i = 0; i < q.length; i++) {
			q[i] = s.pop();
		}
		for(int i = q.length - 1; 0 <= i; i--) {
			sb.append(q[i]);
		}
		int x = s1.size();
		for(int i = 0; i < x; i++) {
			sb.append(s1.pop());
		}
		sb.append("\n");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}