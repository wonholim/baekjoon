

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int t1 = Integer.parseInt(st.nextToken());
			long[] c = new long[n + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				c[i] = Integer.parseInt(st.nextToken()) + c[i - 1];
			}
			while(t1 --> 0) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken()) + 1;
				int j = Integer.parseInt(st.nextToken()) + 1;
				if(i == 1) sb.append(c[j] + "\n");
				else sb.append(c[j] - c[i - 1] + "\n");
			}
			sb.append("\n");
		}
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
