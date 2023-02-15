

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static long[] memo;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		memo = new long[68];
		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 4;
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			for(int i = 4; i <= k; i++) {
				memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3] + memo[i - 4];
			}
			sb.append(memo[k] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
