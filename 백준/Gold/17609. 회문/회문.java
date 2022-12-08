

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
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			char[] c = br.readLine().toCharArray();
			int l = 0;
			int r = c.length - 1;
			int count = 0;
			int count2 = 0;
			while(l < r) {
				if(c[l] == c[r]) {
					l++;
					r--;
				}else if(c[l] != c[r]){
					if(c[l] == c[r - 1]) {
						r--;
						count++;
					}else if(c[l + 1] == c[r]) {
						l++;
						count++;
					}else {
						count = 2;
					}
				}
				if(count == 2) break;
			}
			l = 0;
			r = c.length - 1;
			while(l < r) {
				if(c[l] == c[r]) {
					l++;
					r--;
				}else if(c[l] != c[r]){
					if(c[l + 1] == c[r]) {
						l++;
						count2++;
					}else if(c[l] == c[r - 1]) {
						r--;
						count2++;
					}else {
						count2 = 2;
					}
				}
				
				if(count2 == 2) break;
			}
			sb.append(Math.min(count2, count) + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
