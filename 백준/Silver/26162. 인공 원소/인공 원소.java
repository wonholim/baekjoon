

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
		int t = Integer.parseInt(br.readLine());
		boolean[] c = new boolean[119];
		for(int i = 2; i < 119; i++) {
			if(c[i]) continue;
			for(int j = i * 2; j < 119; j = i + j) {
				c[j] = true;
			}
		}
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			if(k % 2 == 0 && k > 3) {sb.append("Yes\n"); continue;}
			boolean check = false;
			for(int i = 2; i < 119; i++) {
				if(c[i]) continue;
				for(int j = i; j < 119; j++) {
					if(c[j]) continue;
					if(i + j == k) {
						check = true;
						break;
					}else if(i + j > k) {
						break;
					}
				}
				if(check) break;
			}
			if(check) sb.append("Yes\n");
			else sb.append("No\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
