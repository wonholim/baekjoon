import java.io.*;
import java.util.*;
public class Main {
	static List<Integer> list = new ArrayList<>();
	static int max = 0;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while (k --> 0) list.add(Integer.parseInt(st.nextToken()));
		go(0, 0);
		System.out.println(max);
	}
	public static void go(int ans, int idx) {
		if (idx == Integer.toString(n).length()) {
			if (ans <= n) {
				max = Math.max(max, ans);
			}
			return;
		}
		for (Integer tmp : list) {
			go(ans * 10 + tmp, idx + 1);
			go(ans, idx + 1);
		}
	}
}