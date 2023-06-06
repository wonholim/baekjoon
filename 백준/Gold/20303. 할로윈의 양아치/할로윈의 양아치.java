
import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int m;
	static int k;
	static int[] candy;
	static int[] people;
	static int[] parent;
	static int[][] dp;
	static int[] v;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		candy = new int[n + 1];
		v = new int[n + 1];
		people = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
			people[i] = 1;
			candy[i] = Integer.parseInt(st.nextToken());
		}
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			unionParent(x, y);
		}
		for(int i = 1; i < n + 1; i++) {
			getParent(i);
		}
		for(int i = 1; i < n + 1; i++) {
			people[parent[i]]++;
			people[i]--;
			v[parent[i]] += candy[i];
		}
		dp = new int[n + 1][k];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < k; j++) {
				if(j - people[i] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - people[i]] + v[i]);
				}else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		sb.append(dp[n][k - 1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static int getParent(int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if(x > y) parent[x] = y;
		else parent[y] = x;
	}
	private static boolean find(int x, int y) {
		// TODO Auto-generated method stub
		return getParent(x) == getParent(y) ? true : false;
	}

}
