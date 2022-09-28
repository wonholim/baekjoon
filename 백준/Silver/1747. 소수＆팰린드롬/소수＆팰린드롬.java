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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int[] b = new int[2000001];
		b[1] = 1;
		for(int i = 2; i < b.length; i++) {
			if(b[i] == 1) continue;
			for(int j = 2 * i; j <b.length; j = j + i) {
				b[j] = 1;
			}
		}
		for(int i = a; i < b.length; i++) {
			if(b[i] == 1) continue;
			String[] c = Integer.toString(i).split("");
			if(c.length == 1) {sb.append(i); break;}
			else {
				boolean check = true;
				int k = c.length - 1;
				for(int j = 0; j < c.length / 2; j++) {
					if(!c[j].equals(c[k])) {
						check = false;
						break;
					}
					k--;
				}
				if(check) {sb.append(i); break;}
				else {continue;}
				
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}