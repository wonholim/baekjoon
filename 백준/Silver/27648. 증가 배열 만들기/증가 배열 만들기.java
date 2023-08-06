
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		if (n + m - 1 <= k) {
			sb.append("YES\n");
			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= m + i - 1; j++) {
					sb.append(j).append(" ");
				}
				sb.append('\n');
			}
		} else {
			sb.append("NO\n");
		}
		System.out.println(sb.toString());
	}
}
