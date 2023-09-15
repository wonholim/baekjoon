import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int q = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n * k; i++) {
			q += Integer.parseInt(st.nextToken());
			if (i % k == 0) {
				if (q >= p) cnt++;
				q = 0;
			}
		}
		System.out.println(cnt);
	}
}