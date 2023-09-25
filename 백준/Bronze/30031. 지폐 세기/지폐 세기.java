import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> m = Map.of("136 68", 1000, "142 68", 5000,
				"148 68", 10000, "154 68", 50000);
		int ans = 0;
		while (n --> 0) ans += m.get(br.readLine());
		System.out.println(ans);
	}
}