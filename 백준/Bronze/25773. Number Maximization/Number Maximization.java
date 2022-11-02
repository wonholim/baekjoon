

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] g = br.readLine().split("");
		Arrays.sort(g, Collections.reverseOrder());
		for(String k : g) {
			sb.append(k);
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
