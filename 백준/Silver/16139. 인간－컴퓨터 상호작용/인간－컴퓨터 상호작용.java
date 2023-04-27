
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<Character, Integer> m = new HashMap<>();
		ArrayList<Character> ts = new ArrayList<>();
		String line = br.readLine();
		char[] c = new char[line.length() + 1];
		for(int i = 1; i < c.length; i++) {
			c[i] = line.charAt(i - 1);
			if(!ts.contains(c[i])) ts.add(c[i]);
		}
		Collections.sort(ts);
		for(int i = 0; i < ts.size(); i++) {
			m.put(ts.get(i), i);
		}
		int[][] prefixSum = new int[ts.size()][c.length];
		for(int i = 0; i < ts.size(); i++) {
			char d = ts.get(i);
			for(int j = 1; j < c.length; j++) {
				if(c[j] == d) {
					prefixSum[i][j] = 1;
				}
				prefixSum[i][j] += prefixSum[i][j - 1];
			}
		}
		int n = Integer.parseInt(br.readLine());
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			char g = st.nextToken().charAt(0);
			if(m.get(g) == null) {sb.append("0\n"); continue;}
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			if(i != 0) sb.append(prefixSum[m.get(g)][j + 1] - prefixSum[m.get(g)][i]).append("\n");
			else sb.append(prefixSum[m.get(g)][j + 1]).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
