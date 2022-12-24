

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			String k = br.readLine();
			String ans = "";
			for(char c : k.toCharArray()) {
				if(c == 'y') {
					ans += 'a';
				}else if(c == 'a') {
					ans += 'e';
				}else if(c == 'e') {
					ans += 'i';
				}else if(c == 'i') {
					ans += 'o';
				}else if(c == 'o') {
					ans += 'u';
				}else if(c == 'u') {
					ans += 'y';
				}else if(c == 'Y') {
					ans += 'A';
				}else if(c == 'A') {
					ans += 'E';
				}else if(c == 'I') {
					ans += 'O';
				}else if(c == 'O') {
					ans += 'U';
				}else if(c == 'U') {
					ans += 'Y';
				}else if(c == 'E') {
					ans += 'I';
				}else {
					ans += c;
				}
			}
			sb.append(ans + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
