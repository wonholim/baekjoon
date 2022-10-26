
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		int c = Integer.parseInt(br.readLine());
		while(c --> 0) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			if(d == e) {sb.append("1\n"); continue;}
			while(true) {
				if(b[d] != b[e]) {
					sb.append("0\n");
					break;
				}
				e--;
				d++;
				if(e == d) {
					sb.append("1\n");
					break;
				}else if(Math.abs(d - e) == 1) {
					if(b[d] == b[e]) {
						sb.append("1\n");
						break;
					}else {
						sb.append("0\n");
						break;
						
					}
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
