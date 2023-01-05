

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String k = "";
		while((k = br.readLine()) != null) {
			int t = Integer.parseInt(k);
			Set<String> s = new HashSet<>();
			while(t --> 0) {
				Set<String> tmp = new HashSet<>();
				String[] c = br.readLine().split("");
				Arrays.sort(c);
				String l = "";
				for(int i = 0; i < c.length; i++) {
					if(!tmp.contains(c[i])) {
						tmp.add(c[i]);
						l += c[i];
					}
				}
				s.add(l);
			}
			sb.append(s.size() + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
