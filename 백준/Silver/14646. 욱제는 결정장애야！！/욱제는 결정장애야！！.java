import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) * 2;
		int s = 0;
		Map<Integer, Boolean> m = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (n --> 0) {
			int k = Integer.parseInt(st.nextToken());
			if (m.remove(k) == null) m.put(k, true);
			s = Math.max(s, m.size());
		}
		System.out.println(s);
	}
}
