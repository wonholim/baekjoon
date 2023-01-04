

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static Queue<int[]> q;
	static int x;
	static int y;
	static ArrayList<Integer>[] list;
	static boolean[] d;
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		list = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		d = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			list[i].add(j);
			list[j].add(i);
		}
		d[x] = true;
		dfs(x, 0);
		if(count == 0) sb.append(-1);
		else sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int e) {
		// TODO Auto-generated method stub
		if(i == y) {count = e; return;}
		for(int k : list[i]) {
			if(!d[k]) {
				d[k] = true;
				dfs(k, e + 1);
			}
		}
	}
}
