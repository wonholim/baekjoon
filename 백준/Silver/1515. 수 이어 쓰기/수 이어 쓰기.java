

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
		String nums = br.readLine();
		int count = 1;
		int i = 0;
		while(true) {
			for(char c : Integer.toString(count).toCharArray()) {
				if(c == nums.charAt(i)) {
					i++;
				}
				if(i == nums.length()) break;
			}
			if(i == nums.length()) break;
			count++;
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
