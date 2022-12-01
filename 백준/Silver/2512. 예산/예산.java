

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
	static int[] a;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		a = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		for(int i = 1; i < n + 1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			max = Math.max(a[i], max);
		}
		m = Integer.parseInt(br.readLine());
		Arrays.sort(a, 1, n + 1);
		long l = 1;
		long r = max;
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
	private static boolean determination(long mid) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(int i = 1; i < n + 1; i++) {
			if(a[i] >= mid) {
				sum += mid;
			}else {
				sum += a[i];
			}
		}
		return sum <= m;
	}

}
