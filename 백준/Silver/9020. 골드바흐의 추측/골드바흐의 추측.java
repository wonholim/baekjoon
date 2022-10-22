

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] b = new boolean[10001];
		b[0] = true;
		b[1] = true;
		for(int i = 2; i < 10001; i++) {
			if(b[i]) continue;
			for(int j = 2 * i; j < 10001; j = i + j) {
				b[j] = true;
			}
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int c = Integer.parseInt(br.readLine());
			int d = c / 2;
			int e = c / 2;
			while(true) {
				if(!b[d] && !b[e] && d + e == c) {
					sb.append(d + " " + e + "\n");
					break;
				}else {
					d--;
					e++;
				}
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
