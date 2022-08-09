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
		int a = Integer.parseInt(st.nextToken()); // 배열의 크기
		st = new StringTokenizer(br.readLine());
		Stack<Integer> s = new Stack<>(); // 스택 선언
		int[] b = new int[a];
		int[] c = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		s.push(0);
		for(int i = 1; i < a; i++) {
			if(s.isEmpty()) s.push(i);
			while(!s.isEmpty() && b[s.peek()] < b[i]) {
				c[s.pop()] = b[i];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			c[s.pop()] = -1;
		}
		for(int g : c) {
			sb.append(g).append(" ");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}