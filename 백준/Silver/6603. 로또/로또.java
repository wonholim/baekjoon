

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] c;
	static int min;
	static boolean[] v;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if(n == 0) break;
			c = new int[n + 1];
			v = new boolean[n + 1];
			for(int i = 1; i < n + 1; i++) {
				c[i] = Integer.parseInt(st.nextToken());
			}
			recursive(1, 0);
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k, int count) {
		// TODO Auto-generated method stub
		if(count == 6) {
			for(int i = 1; i <= n; i++) {
				if(v[i]) sb.append(c[i] + " ");
			}
			sb.append("\n");
		}else {
			for(int i = k; i <= n; i++) {
				if(!v[i]) {
					v[i] = true;
					recursive(i + 1, count + 1);
					v[i] = false;
				}
			}
		}
	}

}
