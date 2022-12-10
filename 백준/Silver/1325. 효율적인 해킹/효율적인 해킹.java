

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] d;
	static int[] c;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		c = new int[n + 1];
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
		}
		for(int i = 1; i < n + 1; i++) {
			d = new boolean[n + 1];
			dfs(i);
		}
		int max = 0;
		for(int i = 1; i < n + 1; i++) {
			max = Math.max(max, c[i]);
		}
		for(int i = 1; i < n + 1; i++) {
			if(c[i] == max) {
				sb.append(i + " ");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i) {
		// TODO Auto-generated method stub
		d[i] = true;
		for(int k : list[i]) {
			if(!d[k]) {
				c[k]++;
				dfs(k);
			}
		}
	}

}
