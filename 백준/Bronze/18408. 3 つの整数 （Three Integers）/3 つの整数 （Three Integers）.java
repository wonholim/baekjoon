

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int o = 0;
		int t = 0;
		while(st.hasMoreTokens()) {
			if(Integer.parseInt(st.nextToken()) == 1) {
				o++;
			}else {
				t++;
			}
		}
		if(o > t) sb.append(1);
		else sb.append(2);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
