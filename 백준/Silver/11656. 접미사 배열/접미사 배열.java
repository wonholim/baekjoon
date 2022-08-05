import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Deque<Character> d = new ArrayDeque<>();
		String a = br.readLine();
		ArrayList<String> list = new ArrayList<>();
		for(char c : a.toCharArray()) {
			d.offerLast(c);
		}
		while(!d.isEmpty()) {
				int j = 0;
				char[] q = new char[d.size()];
				for(Character k : d) {
					q[j] = k;
					j++;
				}
				list.add(String.valueOf(q));
				d.pollFirst();
		}
		Collections.sort(list);
		for(String e : list) {
			sb.append(e).append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
