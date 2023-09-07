import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		boolean[][] c = new boolean[501][501];
		while (n --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int i = x; i < x2; i++) {
				for (int j = y; j < y2; j++) {
					c[i][j] = true;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < 501; i++) {
			for (int j = 0; j < 501; j++) {
				if (c[i][j]) cnt++;
			}
		}
		System.out.print(cnt);
	}
}