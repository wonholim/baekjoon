import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
	static Map<Integer, List<Integer>> m = new HashMap<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			m.put(i, new ArrayList<>());
			m.get(i).add(n);
			m.get(i).add(i);
			find(i, n - i, i);
		}
		List<Integer> list = m.entrySet()
								 .stream()
								 .max(Comparator.comparingInt(k -> k.getValue().size()))
								 .map(Map.Entry::getValue)
								 .orElse(new ArrayList<>());
		String ans = list.stream().map(String::valueOf).collect(Collectors.joining(" "));
		System.out.print(list.size() + "\n" + ans);
	}
	public static void find(int n, int i, int key) {
		if (i < 0) return;
		m.get(key).add(i);
		find(i, n - i, key);
	}
}
