

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String ans = br.readLine();
		Deque<Character> dq = new ArrayDeque<>();
		char c = ans.charAt(0);
		dq.offer(c);
		for(int i = 1; i < ans.length(); i++) {
			if(c < ans.charAt(i)) {
				dq.offerFirst(ans.charAt(i));
			}else {
				c = ans.charAt(i);
				dq.offerLast(ans.charAt(i));
			}
		}
		while(!dq.isEmpty()) {
			sb.append(dq.pollLast());
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
