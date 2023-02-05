
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
		int t = Integer.parseInt(br.readLine());
		int count = 0;
		while(t --> 0) {
			Stack<Character> s = new Stack<>();
			for(char c : br.readLine().toCharArray()) {
				if(!s.isEmpty()) {
					if(s.peek() == c) {
						s.pop();
					}else {
						s.push(c);
					}
				}else {
					s.push(c);
				}
			}
			if(s.isEmpty()) count++;
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
