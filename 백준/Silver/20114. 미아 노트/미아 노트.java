
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken()) - 1;
		int w = Integer.parseInt(st.nextToken());
		char[] c = br.readLine().toCharArray();
		while (h --> 0) {
			String k = br.readLine();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '?') c[i] = k.charAt(i);
			}
		}
		for (int i = 0; i < n; i++) {
			Set<Character> s = new HashSet<>();
			for (int j = i * w; j < (i * w) + w; j++) {
				s.add(c[j]);
			}
			if (s.size() == 2) s.removeIf(ch -> ch == '?');
			s.forEach(System.out::print);
		}
	}
}
