import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Map<Integer, Integer> m = new HashMap<>();
		while (n --> 0) {
			st = new StringTokenizer(br.readLine());
			int inst = Integer.parseInt(st.nextToken());
			if (inst == 1) {
				int x = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				m.put(w, x);
			} else {
				int w = Integer.parseInt(st.nextToken());
				sb.append(m.get(w)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}

}
