

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String k = br.readLine();
		ArrayList<Character> list = new ArrayList<>();
		list.add('U');
		list.add('C');
		list.add('P');
		list.add('C');
		for(char c : k.toCharArray()) {
			if(c == list.get(0)) {
				list.remove(0);
			}
			if(list.size() == 0) break;
		}
		if(list.isEmpty()) sb.append("I love UCPC");
		else sb.append("I hate UCPC");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
