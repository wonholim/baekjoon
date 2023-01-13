

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		boolean[] d = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n - 1; i++) {
			d[Integer.parseInt(st.nextToken())] = true;
		}
		for(int i = 1; i < n + 1; i++) {
			if(!d[i]) sb.append(i);
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
