

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		if(n == 0) {
			System.out.println("NO");
			return;
		}
		if(n % 3 != 0) {
			if((n - 1) % 3 != 0) {
				System.out.print("NO");
				return;
			}
		}
		while(n != 0) {
			if(n % 3 > 1) {
				System.out.println("NO");
				return;
			}
			n /= 3;
		}
		sb.append("YES");
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
