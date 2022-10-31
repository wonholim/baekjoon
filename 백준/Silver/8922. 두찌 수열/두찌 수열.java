

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
		int a = Integer.parseInt(br.readLine());
		
		while(a --> 0) {
			boolean check = false;
			int b = Integer.parseInt(br.readLine());
			int[] c = new int[b + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < b; i++) {
				c[i] = Integer.parseInt(st.nextToken());
			}
			c[b] = c[0];
			for(int i = 0; i < 1000; i++) {
				for(int k = 0; k < b; k++) {
					c[k] = Math.abs(c[k] - c[k + 1]);
				}
				c[b] = c[0];
				check = true;
				for(int j = 0; j < b; j++) {
					if(c[j] != 0) {
						check = false;
						break;
					}
				}
				if(check) {sb.append("ZERO\n");break;}
			}
			if(!check) sb.append("LOOP\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
