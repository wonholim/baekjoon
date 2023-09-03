import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] e = new int[1002][1002];
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			for (int j = a; j < a + c; j++) {
				for (int k = b; k < b + d; k++) {
					e[j][k] = i;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int a = 0; a < 1002; a++) {
				for (int b = 0; b < 1002; b++) {
					if (e[a][b] == i) cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
