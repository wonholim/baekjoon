

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
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int[] a = new int[m];
			int[] b = new int[n + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(b);
			int sum = 0;
			for(int i = 0; i < a.length; i++) {
				sum += lower_bound(b, 1, n, a[i]);
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int lower_bound(int[] b, int l, int r, int s) {
		// TODO Auto-generated method stub
		int result = l - 1;
		while(l <= r) {
			int mid = (l + r) / 2;
			if(b[mid] < s) {
				result = mid;
				l = mid + 1;
			}else if(b[mid] >= s){
				r = mid - 1;
			}
		}
		return result;
	}

}
