

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String k = br.readLine();
		int count = 0;
		for(char c : k.toCharArray()) {
			if(c == 'X') count++;
			else if(c == '.' && count > 0) {
				if(count % 2 != 0) {
					System.out.print(-1);
					return;
				}
				for(int j = 0; j < count / 4; j++) {
					sb.append("AAAA");
				}
				for(int j = 0; j < (count % 4) / 2; j++) {
					sb.append("BB");
				}
				sb.append(".");
				count = 0;
			}else {
				sb.append(".");
			}
		}
		if(count != 0) {
			if(count % 2 != 0) {
				System.out.print(-1);
				return;
			}
			for(int j = 0; j < count / 4; j++) {
				sb.append("AAAA");
			}
			for(int j = 0; j < (count % 4) / 2; j++) {
				sb.append("BB");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
