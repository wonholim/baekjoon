

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
		Stack<int[]> s = new Stack<>();
		int sum = 0;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			if(b == 1) {
				int g = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken()) - 1;
				if(m == 0) {
					sum += g;
				}else {
					s.push(new int[] {g, m});
				}
			}else {
				if(!s.isEmpty()) {
					int[] g = s.pop();
					if(g[1] - 1 == 0) {
						sum += g[0];
					}else {
						s.push(new int[] {g[0], g[1] - 1});
					}
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
