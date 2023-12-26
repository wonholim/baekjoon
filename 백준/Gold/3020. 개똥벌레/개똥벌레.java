import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int[] topPrefix = new int[h + 1];
		int[] bottomPrefix = new int[h + 1];
		for (int i = 0; i < n; i++){
			int k = Integer.parseInt(br.readLine());
			if (i % 2 == 0) bottomPrefix[k]++;
			else topPrefix[k]++;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = h - 1; i > 0; i--) {
			topPrefix[i] += topPrefix[i + 1];
			bottomPrefix[i] += bottomPrefix[i + 1];
		}
		for (int i = 1; i <= h; i++) {
			list.add(topPrefix[i] + bottomPrefix[h - i + 1]);
		}
		Collections.sort(list);
		System.out.println(
				list.get(0)
				+ " " 
				+ list.stream()
					.mapToInt(x -> x.intValue())
					.takeWhile(x -> list.get(0) == x)
					.count()
		);
	}
}