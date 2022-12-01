

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int m;
	static int n;
	static int[] a;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		a = new int[m + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < m + 1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		long l = 0;
		long r = 2000000000;
		long ans = 0;
		while(l <= r) {
			long mid = (int)((l + r) / 2);
			if(determination((int)mid)) {
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
	static boolean determination(int h) {
		long sum = 0;
		for(int i = 1; i <= m; i++) {
			if(a[i] > h) {
				sum += a[i] - h;
			}
		}
		return sum >= n;
	}
}
