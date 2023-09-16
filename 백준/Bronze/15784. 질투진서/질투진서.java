import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()) - 1;
		int b = Integer.parseInt(st.nextToken()) - 1;
		int max = 0;
		int x = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int k = Integer.parseInt(st.nextToken());
				if (i == a && j == b) x = k;
				else if (i == a || j == b) max = Math.max(max, k);
			}
		}
		System.out.println(max > x ? "ANGRY" : "HAPPY");
	}
}