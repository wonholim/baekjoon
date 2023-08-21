import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		while (m --> 0) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			if (k == 1) continue;
			Stack<Integer> s = new Stack<>();
			while (k --> 0) {
				s.add(Integer.parseInt(st.nextToken()));
			}
			while (s.size() != 1) {
				if (s.pop() > s.peek()) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}