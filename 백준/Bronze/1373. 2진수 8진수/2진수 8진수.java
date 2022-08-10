import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		Stack<Integer> s = new Stack<>();
		int d = a.length() % 3;
		int b = a.length() / 3;
		int i = 0;
		while(b --> 0) {
			String c = a.substring((a.length() - 3) - i, (a.length()) - i);
			s.push(what(c));
			i = i + 3;
		}
		if(d == 1) {
			String q = "00" + a.substring(0, 1);
			s.push(what(q));
		}else if(d == 2) {
			String q = "0" + a.substring(0, 2);
			s.push(what(q));
		}
		while(!s.isEmpty()) {
			sb.append(s.pop());
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

	private static int what(String c) {
		// TODO Auto-generated method stub
		if(c.equals("000")) {
			return 0;
		}else if(c.equals("001")) {
			return 1;
		}else if(c.equals("010")) {
			return 2;
		}else if(c.equals("100")) {
			return 4;
		}else if(c.equals("101")) {
			return 5;
		}else if(c.equals("110")) {
			return 6;
		}else if(c.equals("011")) {
			return 3;
		}else {
			return 7;
		}
	}

}