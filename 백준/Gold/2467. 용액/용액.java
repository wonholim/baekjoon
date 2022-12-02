

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
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[m + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= m; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a, 1, m + 1);
		int best_sum = Integer.MAX_VALUE;
		int v1 = 0;
		int v2 = 0;
		for(int i = 1; i <= m - 1; i++) {
			int result = lower_bound(a, i + 1, m, -a[i]);
			
			if(i + 1 <= result - 1 && result - 1 <= m && Math.abs(a[result - 1] + a[i]) < best_sum) {
				best_sum = Math.abs(a[result - 1] + a[i]);
				v1 = a[i];
				v2 = a[result - 1];
			}
			
			if(i + 1 <= result && result <= m && Math.abs(a[result] + a[i]) < best_sum) {
				best_sum = Math.abs(a[result] + a[i]);
				v1 = a[i];
				v2 = a[result];
			}
		}
		sb.append(v1 + " " + v2);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int lower_bound(int[] a, int l, int r, int s) {
		// TODO Auto-generated method stub
		int result = r + 1;
		while(l <= r) {
			int mid = (l + r) / 2;
			if(a[mid] >= s) {
				result = mid;
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return result;
	}

}
