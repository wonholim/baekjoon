import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String[] line = br.readLine().split(",");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(line[i]));
		}
		while (k --> 0) {
			List<Integer> tmp = new ArrayList<>();
			for (int i = 1; i < list.size(); i++) {
				tmp.add(list.get(i) - list.get(i - 1));
			}
			list.clear();
			list.addAll(tmp);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size() - 1; i++) {
			sb.append(list.get(i)).append(',');
		}
		sb.append(list.get(list.size() - 1));
		System.out.println(sb.toString());
	}
}
