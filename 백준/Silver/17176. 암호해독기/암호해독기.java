

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] c = new int[53];
		int t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			c[Integer.parseInt(st.nextToken())]++;
		}
		String line = br.readLine();
		for(char g : line.toCharArray()) {
			if(g == ' ') {
				c[0]--;
				if(c[0] < 0) {
					System.out.println("n");
					return;
				}
			}else if(g >= 'A' && g <= 'Z'){
				c[g - '@']--;
				if(c[g - '@'] < 0) {
					System.out.println("n");
					return;
				}
			}else {
				c[g - 'F']--;
				if(c[g - 'F'] < 0) {
					System.out.println("n");
					return;
				}
			}
		}
		sb.append("y");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
