

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
		StringBuilder a = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int i = 1;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb.append("Case #" + i + ": ");
			if(k > r * c) {
				sb.append("RICHARD\n");
			}else if(k == 1) {
				sb.append("GABRIEL\n");
			}else if(k == 2) {
				if((r * c) % k != 0) {
					sb.append("RICHARD\n");
				}else {
					sb.append("GABRIEL\n");
				}
			}else if(k == 3) {
				if(r * c == 3 || r * c == 8 || r * c == 16 || r * c == 4) {
					sb.append("RICHARD\n");
				}else {
					sb.append("GABRIEL\n");
				}
			}else if(k == 4) {
				if(r * c == 4 || r * c == 6 || r * c == 8 || r * c == 9) {
					sb.append("RICHARD\n");
				}else {
					sb.append("GABRIEL\n");
				}
			}
			i++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
