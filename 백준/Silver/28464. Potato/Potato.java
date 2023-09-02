import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		long sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (n --> 0) {
			int k = Integer.parseInt(st.nextToken());
			sum += k;
			list.add(k);
		}
		Collections.sort(list);
		long a = 0;
		for (int i = 0; i < list.size() / 2; i++) {
			a += list.get(i);
		}
		System.out.println(a + " " + (sum - a));
	}
}