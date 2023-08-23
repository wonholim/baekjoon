import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			sb.append("Case #" + i + ": ");
			int k = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] c = new int[k];
			for (int j = 0; j < k; j++) {
				c[j] = Integer.parseInt(st.nextToken());
			}
			if (go(c)) sb.append("Alice\n"); 
			else sb.append("Bob\n");
		}
		System.out.println(sb.toString());
	}
	public static boolean go(int[] c) {
		if (c.length == 2) {
			return c[0] > c[1];
		}
		int i = 0;
		int j = c.length - 1;
		int [] k = new int[c.length / 2 + 1];
		while (i <= j) {
			k[i] = c[i++] + c[j--];
		}
		return go(k);
	}
}