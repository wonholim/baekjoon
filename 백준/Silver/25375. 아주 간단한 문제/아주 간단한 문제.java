import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		while (n --> 0) {
			st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken());
			long y = Long.parseLong(st.nextToken());
			if (y % x == 0 && 2 * x <= y) sb.append(1);
			else sb.append(0);
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}