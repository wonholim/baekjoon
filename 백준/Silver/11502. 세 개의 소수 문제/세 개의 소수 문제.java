

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] b = new boolean[1001];
		for(int i = 2; i <= 1000; i++) {
			if(b[i]) continue;
			for(int j = 2 * i; j <= 1000; j = i + j) {
				b[j] = true;
			}
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			ArrayList<Integer> list = new ArrayList<>();
			int c = Integer.parseInt(br.readLine()) - 3;
			if(c < 3) {sb.append("0\n"); continue;}
			boolean check = false;
			for(int i = 2; i <= 1000; i++) {
				if(b[i]) continue;
				for(int j = 2; j <= 1000; j++) {
					if(b[j]) continue;
					if(i + j == c) {
						list.add(i);
						list.add(j);
						list.add(3);
						check = true;
						break;
					}else if(i + j > c) break;
				}
				if(check) break;
			}
			Collections.sort(list);
			for(int k : list) {
				sb.append(k + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
