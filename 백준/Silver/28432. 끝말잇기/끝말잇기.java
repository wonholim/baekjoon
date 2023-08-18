import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<String, Boolean> m = new HashMap<>();
		List<String> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		while (n --> 0) {
			String word = br.readLine();
			m.put(word, true);
			list.add(word);
		}
		int idx = list.indexOf("?");
		n = Integer.parseInt(br.readLine());
		String coc = "";
		if (list.size() == 1) {
			System.out.println(br.readLine());
			return;
		}
		if (idx == 0) {
			coc = list.get(idx + 1).charAt(0) + "";
			while (n --> 0) {
				String k = br.readLine();
				if (m.get(k) == null &&
				   ("" + k.charAt(k.length() - 1)).equals(coc)) {
					System.out.println(k);
					return;
				}
			}
		} else if (idx == list.size() - 1) {
			coc = list.get(idx - 1).charAt(list.get(idx - 1).length() - 1) + "";
			while (n --> 0) {
				String k = br.readLine();
				if (m.get(k) == null &&
				   (k.charAt(0) + "").equals(coc)) {
					System.out.println(k);
					return;
				}
			}
		} else {
			coc = list.get(idx - 1).charAt(list.get(idx - 1).length() - 1) + "" + list.get(idx + 1).charAt(0);
			while (n --> 0) {
				String k = br.readLine();
				if (m.get(k) == null &&
				   (k.charAt(0) + "" + k.charAt(k.length() - 1)).equals(coc)) {
					System.out.println(k);
					return;
				}
			}
		}
	}
}