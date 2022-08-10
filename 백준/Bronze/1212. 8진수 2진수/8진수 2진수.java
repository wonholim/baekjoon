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
		String[] a = br.readLine().split("");
		Stack<String> s = new Stack<>();
		for(int i = a.length -1; 0 < i; i--) {
			s.push(what(a[i]));
		}
		s.push(how(a[0]));
		while(!s.isEmpty()) {
			sb.append(s.pop());
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

	private static String how(String c) {
		// TODO Auto-generated method stub
		if(c.equals("1")) {
			return "1";
		}else if(c.equals("2")) {
			return "10";
		}else if(c.equals("4")) {
			return "100";
		}else if(c.equals("5")) {
			return "101";
		}else if(c.equals("6")) {
			return "110";
		}else if(c.equals("3")) {
			return "11";
		}else if(c.equals("0")){
			return "0";
		}else{
			return "111";	
		}
	}

	private static String what(String c) {
		// TODO Auto-generated method stub
		if(c.equals("0")) {
			return "000";
		}else if(c.equals("1")) {
			return "001";
		}else if(c.equals("2")) {
			return "010";
		}else if(c.equals("4")) {
			return "100";
		}else if(c.equals("5")) {
			return "101";
		}else if(c.equals("6")) {
			return "110";
		}else if(c.equals("3")) {
			return "011";
		}else {
			return "111";
		}
	}

}
