import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		List<Integer> g_list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		long sum = 0;
		while (n --> 0) {
			int c = Integer.parseInt(st.nextToken());
			list.add(c);
		}
		for (int i = 1; i < list.size(); i++) {
			g_list.add(list.get(i) - list.get(i - 1));
			sum += list.get(i) - list.get(i - 1);
		}
		Collections.sort(g_list, Collections.reverseOrder());
		for (int i = 0; i < k - 1; i++) {
			sum -= g_list.get(i);
		}
		System.out.println(sum);
	}
}