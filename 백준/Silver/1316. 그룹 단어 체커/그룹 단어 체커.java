

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int count = a;
		while(a --> 0) {
			int[] g = new int[26];
			String b = br.readLine();
			boolean c = false;
			char d = b.charAt(0);
			g[d - 'a']++;
			for(int i = 0; i < b.length(); i++) {
				if(d == b.charAt(i)) {
					c = true;
				}else if(d != b.charAt(i)) {
					c = false;
					d = b.charAt(i);
				}
				if(!c) g[d - 'a']++;
			}
			for(int i = 0; i < 26; i++) {
				if(g[i] > 1) {
					count--;
					break;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
