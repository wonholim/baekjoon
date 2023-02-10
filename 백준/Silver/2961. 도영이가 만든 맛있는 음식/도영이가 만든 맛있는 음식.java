

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long[] a;
	static long[] b;
	static boolean[] c;
	static long max;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		a = new long[n];
		b = new long[n];
		c = new boolean[n];
		max = Long.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
		}
		BT(1, 0, 0);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(long q, long w, int k) {
		// TODO Auto-generated method stub
		if(k > 0 && Math.abs(q - w) < max) {
			max = Math.abs(q - w);
		}
		for(int i = 0; i < n; i++) {
			if(!c[i]) {
				c[i] = true;
				BT(q * a[i], w + b[i], k + 1);
				c[i] = false;
			}
		}
	}

}
