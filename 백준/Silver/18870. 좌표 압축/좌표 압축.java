

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int[] c = new int[t];
		int[] d = new int[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			d[i] = c[i];
		}
		Arrays.sort(c);
		Map<Integer, Integer> m = new HashMap<>();
		Set<Integer> s= new HashSet<>();
		int g = 0;
		for(int i = 0; i < t; i++) {
			if(s.contains(c[i])) continue;
			m.put(c[i], g);
			s.add(c[i]);
			g++;
		}
		for(int k : d) {
			sb.append(m.get(k) + " ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
