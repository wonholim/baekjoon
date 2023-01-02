

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int t2 = Integer.parseInt(st.nextToken());
			int t3 = Integer.parseInt(st.nextToken());
			int n = 0;
			int m = 0;
			st = new StringTokenizer(br.readLine());
			while(t2 --> 0) {
				n = Math.max(n, Integer.parseInt(st.nextToken()));
			}
			st = new StringTokenizer(br.readLine());
			while(t3 --> 0) {
				m = Math.max(m, Integer.parseInt(st.nextToken()));
			}
			if(m == n) {
				sb.append("S");
			}else if(m > n) {
				sb.append("B");
			}else {
				sb.append("S");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
