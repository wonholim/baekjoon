

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
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		if(n == 1 || m == 1) {
			if(a == x && b == y) {
				System.out.println("YES");
				return;
			}else {
				System.out.println("NO");
				return;
			}
		}else if((a + b) % 2 == 0) {
			if((x + y) % 2 != 0) sb.append("NO");
			else sb.append("YES");
		}else {
			if((x + y) % 2 == 0) sb.append("NO");
			else sb.append("YES");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
