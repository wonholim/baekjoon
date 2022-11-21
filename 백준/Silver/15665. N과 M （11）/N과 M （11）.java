

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	static int[] c;
	static boolean[] v;
	static StringBuilder sb;
	static ArrayList<Integer> list = new ArrayList<>();
	static LinkedHashSet<String> s = new LinkedHashSet<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		c = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		backTracking(m, n, 0);
		for(String g : s) {
			sb.append(g + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void backTracking(int m, int n, int i) {
		// TODO Auto-generated method stub
		if(m == i) {
			String g = "";
			for(int k : c) {
				g += k + " ";
			}
			s.add(g);
			return;
		}
		for(int j = 1; j <= n; j++) {
			c[i] = list.get(j - 1);
			backTracking(m, n, i + 1);
		}
	}
}
