import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			Stack<Character> si = new Stack<>();
			Stack<Character> so = new Stack<>();
			String b = br.readLine();
			boolean check = false;
			for(char c : b.toCharArray()) {
				if(c == '<') {
					check = false;
					if(!si.isEmpty()) {
						so.push(si.pop());
					}
				}else if(c == '>') {
					check = true;
					if(!so.isEmpty()) {
						si.push(so.pop());
					}
				}else if(c == '-') {
					if(!si.isEmpty()) si.pop();
				}else {
					si.push(c);
				}
			}
			while(!si.isEmpty()) {
				so.push(si.pop());
			}
			while(!so.isEmpty()) {
				sb.append(so.pop());
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
