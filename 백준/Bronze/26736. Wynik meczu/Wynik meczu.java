

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder a = new StringBuilder();
		StringTokenizer st;
		String line = br.readLine();
		int count = 0;
		for(char c : line.toCharArray()) {
			if(c == 'A') count++;
		}
		sb.append(count + " : " + (line.length() - count));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
