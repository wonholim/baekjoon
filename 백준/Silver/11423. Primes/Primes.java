

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		boolean[] c = new boolean[10000001];
		for(int i = 2; i < 10000001; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j < 10000001; j = i + j) {
				c[j] = true;
			}
		}
		String a = "";
		while((a = br.readLine()) != null) {
			if(a.equals("")) continue;
			st = new StringTokenizer(a);
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int count = 0;
			for(int i = x; i <= y; i++) {
				if(!c[i]) count++;
			}
			sb.append(count + "\n\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
