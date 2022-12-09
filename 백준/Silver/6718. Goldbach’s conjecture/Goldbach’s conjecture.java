

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] c= new boolean[50000];
		for(int i = 2; i < 50000; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j < 50000; j = i + j) {
				c[j] = true;
			}
		}
		while(true) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			int count = 0;
			for(int i = 2; i <= a; i++) {
				if(c[i]) continue;
				for(int j = i; j <= a; j++) {
					if(c[j]) continue;
					if(i + j == a) count++;
					else if(i + j > a) break;
				}
			}
			sb.append(count + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
