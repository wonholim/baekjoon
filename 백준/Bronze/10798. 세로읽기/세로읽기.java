

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		char[][] c = new char[5][15];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 15; j++) {
				c[i][j] = '.';
			}
		}
		for(int i = 0; i < 5; i++) {
			String k = br.readLine();
			for(int j = 0; j < k.length(); j++) {
				c[i][j] = k.charAt(j);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(c[j][i] == '.') continue;
				else sb.append(c[j][i]);
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
