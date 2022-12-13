

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			String o = br.readLine();
			String c = br.readLine();
			int w = 0;
			int b = 0;
			for(int i = 0; i < k; i++) {
				if(o.charAt(i) != c.charAt(i)) {
					if(o.charAt(i) == 'W') w++;
					else b++;
				}
			}
			sb.append(Math.max(w, b) + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
