

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static long[] a;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		a = new long[n + 1];
		for(int i = 1; i < n + 1; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a, 1, n + 1);
		long l = 1;
		long r = Integer.MAX_VALUE;
		long ans = 0;
		while(l <= r) {
			long mid = (l + r) / 2;
			if(determination(mid)) {
				ans = mid;
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean determination(long h) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(int i = 1; i < n + 1; i++) {
			sum += (a[i] / h);
		}
		return sum >= m;
	}

}
