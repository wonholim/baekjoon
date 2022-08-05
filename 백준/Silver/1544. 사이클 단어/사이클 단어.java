import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		Set<String> s = new HashSet<>();
		Map<String, String> m = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		Deque<Character> d = new ArrayDeque<>();
		int count = 0;
		while(a --> 0) {
			String b = br.readLine();
			if(!list.contains(b)) {
				count++;
				for(char c : b.toCharArray()) {
					d.offerLast(c);
				}
				int e = b.length();
				while(e --> 0) {
					int i = 0;
					char[] q = new char[b.length()];
					for(Character k : d) {
						q[i] = k;
						i++;
					}
					list.add(String.valueOf(q));
					d.offerLast(d.pollFirst());			
				}
				d.clear();
			}else {
				continue;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}