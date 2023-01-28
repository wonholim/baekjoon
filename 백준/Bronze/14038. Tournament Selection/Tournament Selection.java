

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = 6;
		int w = 0;
		while(t --> 0) {
			if(br.readLine().equals("W")) w++;
		}
		if(w >= 5) {
			w = 1;
		}else if(w >= 3) {
			w = 2;
		}else if(w >= 1) {
			w = 3;
		}else {
			w = -1;
		}
		sb.append(w);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
