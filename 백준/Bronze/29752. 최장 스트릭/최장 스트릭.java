import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int max = 0;
		int cnt = 0;
		while (n --> 0) {
			int k = Integer.parseInt(st.nextToken());
			if (k == 0) {
				max = Math.max(max, cnt);
				cnt = 0;
			} else {
				cnt++;
			}
		}
		System.out.println(Math.max(max, cnt));
	}
}