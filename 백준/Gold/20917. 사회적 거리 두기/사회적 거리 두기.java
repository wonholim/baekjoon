


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
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			a = new int[n + 1];
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i < n + 1; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(a, 1, n + 1);
			int l = 1;
			int r = 1000000000;
			int ans = 0;
			while(l <= r) {
				int mid = (l + r) / 2;
				if(determination(mid)) {
					ans = mid;
					l = mid + 1;
				}else {
					r = mid - 1;
				}
			}
			sb.append(ans + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	static boolean determination(int d) {
		int count = 1;
		int last = a[1];
		for(int i = 2; i < n + 1; i++) {
			if(a[i] - last >= d) {
				count++;
				last = a[i];
			}
		}
		return count >= m;
	}
}
