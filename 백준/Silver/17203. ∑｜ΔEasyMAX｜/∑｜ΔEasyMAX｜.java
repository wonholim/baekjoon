

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
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		long[] c = new long[n];
		long[] pre = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		pre[0] = 0;
		for(int i = 1; i < n; i++) {
			pre[i] = Math.abs(c[i] - c[i - 1]) + pre[i - 1];
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			if(x == y) {
				sb.append(0 + "\n");
			}else {
				if(x == 0) sb.append(pre[y] + "\n");
				else sb.append(pre[y] - pre[x] + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
