

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static int[] check;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		check = new int[n + 1];
		d = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n + 1; i++) {
			check[i] = Integer.parseInt(st.nextToken());
			parent[i] = i;
		}
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			unionParent(x, y);
		}
		Set<Integer> s = new HashSet<>();
		for(int i = 1; i < n + 1; i++) {
			s.add(getParent(i));
		}
		int sum = 0;
		for(int k : s) {
			int min = Integer.MAX_VALUE;
			for(int i = 1; i < n + 1; i++) {
				if(k == getParent(i)) {
					min = Math.min(min, check[i]);
				}
			}
			sum += min;
			if(sum > money) {
				System.out.println("Oh no");
				return;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean find(int x, int y) {
		return getParent(x) == getParent(y) ? true : false;
	}
	public static int getParent(int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
	public static void unionParent(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if(x > y) parent[x] = y;
		else parent[y] = x;
	} 
}
