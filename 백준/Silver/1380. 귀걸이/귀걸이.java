import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = 1;
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			List<String> list = new ArrayList<>();
			boolean[] v = new boolean[n];
			for (int i = 0; i < n; i++) {
				list.add(br.readLine());
				v[i] = !v[i];
			}
			for (int i = 0; i < n * 2 - 1; i++) {
				String[] line = br.readLine().split(" ");
				int k = Integer.parseInt(line[0]) - 1;
				v[k] = !v[k];
			}
			int z = IntStream.range(0, n).filter(i -> !v[i]).findFirst().orElse(-1);
			sb.append(t++).append(' ').append(list.get(z)).append('\n');
		}
		System.out.println(sb.toString());
	}
}