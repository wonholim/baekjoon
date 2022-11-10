

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
		Stack<int[]> s = new Stack<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= a; i++) {
			int k = Integer.parseInt(st.nextToken());
			while(!s.isEmpty()) {
				if(s.peek()[0] < k) {
					s.pop();
				}else {
					sb.append(s.peek()[1] + " ");
					break;
				}
			}
			if(s.isEmpty()) sb.append("0 ");
			s.push(new int[] {k, i});
		}


		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
