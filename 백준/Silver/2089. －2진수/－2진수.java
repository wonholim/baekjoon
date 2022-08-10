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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		Stack<Integer> s = new Stack<>();
		while(a != 0) {
			s.push(Math.abs(a % -2));
			a = (int) Math.ceil((double)a / -2);
		}
        if(s.isEmpty()) sb.append("0");
		while(!s.isEmpty()) sb.append(s.pop());
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
