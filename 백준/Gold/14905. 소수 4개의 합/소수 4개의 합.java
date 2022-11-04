

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
		StringBuilder sb = new StringBuilder();
		boolean[] a = new boolean[100_000_001];
		a[0] = true;
		a[1] = true;
		for(int i = 2; i <= 100_000_000; i++) {
			if(a[i]) continue;
			for(int j = 2 * i; j <= 100_000_000; j = i+ j) {
				a[j] = true;
			}
		}
		String b = "";
		while((b = br.readLine()) != null) {
			boolean check = false;
			int c = Integer.parseInt(b);
			if(c < 8) {sb.append("Impossible.\n"); continue;}
			if(c % 2 == 0) {
				sb.append("2 2");
				c = c - 4;
			}else {
				c = c - 5;
				sb.append("2 3");
			}
			for(int i = 2; i <= 100_000_000; i++) {
				if(a[i]) continue;
				for(int j = 2; j <= 100_000_000; j++) {
					if(a[j]) continue;
					if(i + j > c) break;
					else if(i + j == c) {
						sb.append(" "+ i +" "+ j +"\n");
						check = true;
						break;
					}
				}
				if(check) break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
