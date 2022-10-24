

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
		boolean[] b = new boolean[10001];
		b[1] = true;
		for(int i = 2; i < b.length; i++) {
			if(b[i]) continue;
			for(int j = 2 * i; j < b.length; j = i + j) {
				b[j] = true;
			}
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int k = d;
			if(b[d]) {sb.append(c + " " + d + " NO\n"); continue;}
			int sum = 0;
			int count = 0;
			while(k != 1) {
				for(char g : Integer.toString(k).toCharArray()) {
					sum += Math.pow(g - '0', 2);
				}
				k = sum;
				sum = 0;
				count++;
				if(count > 20) {
					sb.append(c + " " + d + " NO\n");
					break;
				}
			}
			if(k == 1) sb.append(c + " " + d + " YES\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
