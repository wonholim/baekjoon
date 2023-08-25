import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> s = new TreeSet<>();
		int n = 2;
		while (n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			s.add(st.nextToken());
			s.add(st.nextToken());
		}
		List<String> list = s.stream().collect(Collectors.toList());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(i)).append(' ').append(list.get(j)).append('\n');
			}
		}
		System.out.println(sb.toString());
	}
}