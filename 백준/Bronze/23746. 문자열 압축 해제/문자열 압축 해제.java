

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		Map<Character, String> m = new HashMap<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			char b = st.nextToken().charAt(0);
			m.put(b, a);
		}
		String g = br.readLine();
		String k = "";
		for(char c : g.toCharArray()) {
			k += m.get(c);
		}
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		sb.append(k.substring(x - 1, y));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
