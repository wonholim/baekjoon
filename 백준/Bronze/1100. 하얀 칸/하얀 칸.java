

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
		int count = 0;
		for(int i = 0; i < 8; i++) {
			String g = br.readLine();
			for(int j = 0; j < 8; j++) {
				if(i % 2 == 0 && j % 2 == 0) {
					if(g.charAt(j) == 'F') count++;
				}else if(i % 2 == 1 && j % 2 == 1) {
					if(g.charAt(j) == 'F') count++;
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
