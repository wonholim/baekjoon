import java.io.*;
import java.util.*;

public class Main {
	static Map<String, Boolean> v = new HashMap<>();
	static Map<String, List<String>> m = new HashMap<>();
	static List<String> lines = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t --> 0) {
			String[] line = br.readLine().split(" ");
			if (m.get(line[0]) == null) m.put(line[0], new ArrayList<>());
			m.get(line[0]).add(line[2]);
			v.put(line[0], false);
			v.put(line[2], false);
		}
		dfs("Baba");
		lines.stream()
			.sorted()
			.forEach(word -> sb.append(word).append('\n'));
		System.out.println(sb.toString());
	}
	private static void dfs(String line) {
		// TODO Auto-generated method stub
		if(m.get(line) == null) return;
		for (String next : m.get(line)) {
			if(!v.get(next)) {
				v.put(next, true);
				dfs(next);
				lines.add(next);
			}
		}
	}

}
