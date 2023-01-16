

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		String n = st.nextToken();
		Set<String> s = new HashSet<>();
		while(t --> 0) {
			s.add(br.readLine());
		}
		if(n.equals("Y")) sb.append(s.size());
		else if(n.equals("F")) sb.append(s.size() / 2);
		else sb.append(s.size() / 3);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
