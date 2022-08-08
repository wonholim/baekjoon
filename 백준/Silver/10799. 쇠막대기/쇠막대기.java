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
		int m = 0;
		int sum = 0;
		for(char c : a.toCharArray()) {
			m++;
			if(c == '(') {
				s.push(m);
			}else {
				if(m - 1 == s.pop()) {
					sum = sum + s.size();
				}else {
					sum = sum + 1;
				}
			}
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
