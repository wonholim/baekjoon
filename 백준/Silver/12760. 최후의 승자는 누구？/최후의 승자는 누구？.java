import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] player = new int[n + 1];
		List<Integer>[] list = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			list[i] = new ArrayList<>();
			for (int j = 0; j < m; j++) list[i].add(Integer.parseInt(st.nextToken()));
			Collections.sort(list[i], Collections.reverseOrder());
		}
		while (m --> 0) {
			List<Integer> turn = IntStream.range(1, n + 1).mapToObj(i -> list[i].remove(0)).collect(Collectors.toList());
			int max = turn.stream().mapToInt(Integer::intValue).max().orElse(1);
			IntStream.range(0, turn.size()).filter(i -> turn.get(i) == max).forEach(idx -> player[idx + 1]++);
		}
		int max = IntStream.of(player).max().orElse(0);
		System.out.println(IntStream.range(1, n + 1).filter(i -> player[i] == max).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
	}
}
