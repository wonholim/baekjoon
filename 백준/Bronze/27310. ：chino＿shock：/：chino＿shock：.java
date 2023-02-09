

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
//		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = br.readLine();
		int count = 0;
		for(char c : n.toCharArray()) {
			if(c == '_') count++;
		}
		sb.append(n.length() + 2 + count * 5);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
