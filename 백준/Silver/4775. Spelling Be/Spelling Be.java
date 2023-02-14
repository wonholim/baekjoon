

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> s = new HashSet<>();
		int n = Integer.parseInt(st.nextToken());
		while(n --> 0) {
			s.add(br.readLine());
		}
		int count = Integer.parseInt(br.readLine());
		for(int i = 1; i <= count; i++) {
			boolean check = false;
			ArrayList<String> list = new ArrayList<>();
			while(true) {
				String k = br.readLine();
				if (k.equals("-1")) break;
				if (!s.contains(k)) {
					check = true;
					list.add(k);
				}
			}
			if(check) {
				sb.append("Email "+ i + " is not spelled correctly.\n");
				for(String k : list) {
					sb.append(k + "\n");
				}
			}else {
				sb.append("Email "+ i + " is spelled correctly.\n");
			}
		}
		sb.append("End of Output");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
