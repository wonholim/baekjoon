import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break; 
			List<String> list = new ArrayList<>();
			while (n --> 0) {
				list.add(br.readLine());
			}
			if (list.size() == 1) {
				sb.append(list.remove(0)).append("\n");
				continue;
			}
			int size = list.size();
			List<String> up = new ArrayList<>();
			List<String> down = new ArrayList<>();
			int length = list.size() / 2;
			if (size % 2 != 0) sb.append(list.remove(0)).append("\n");
			up.addAll(list.subList(0, length));
			down.addAll(list.subList(length, list.size()));
			if (size % 2 == 0) {
				for (int i = 0; i < up.size(); i++) {
					sb.append(up.get(i)).append("\n");
					sb.append(down.get(i)).append("\n");
				}
			} else {
				for (int i = 0; i < up.size(); i++) {
					sb.append(down.get(i)).append("\n");
					sb.append(up.get(i)).append("\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
