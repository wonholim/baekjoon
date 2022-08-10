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
		int sum = 0;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		Stack<Integer> s = new Stack<>();
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			sum = (int) (sum + Integer.parseInt(st.nextToken()) * Math.pow(a, --c));
		}
		while(sum != 0) {
			s.push(sum % b);
			sum = sum / b;
		}
		while(!s.isEmpty()) sb.append(s.pop()).append(" ");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
