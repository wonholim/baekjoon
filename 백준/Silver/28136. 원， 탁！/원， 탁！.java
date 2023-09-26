import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] c = new int[n + 1];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		c[n] = c[0];
		int cnt = 0;
		for (int i = n; i > 0; i--) {
			if (c[i] <= c[i - 1]) cnt++;
		}
		System.out.println(cnt);
	}
}