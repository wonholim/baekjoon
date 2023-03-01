

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
	static int[] parent;
	static int n;
	static int[][] d;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		d = new int[n + 1][n + 1];
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n + 1; j++) {
				d[i][j] = Integer.parseInt(st.nextToken());
				if(d[i][j] == 0) continue;
				if(!find(i, j)) unionParent(i, j);
			}
		}
		int[] c = new int[t + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < t + 1; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int check = getParent(c[1]);
		for(int i = 2; i < t + 1; i++) {
			if(check != getParent(c[i])) {
				System.out.println("NO");
				return;
			}
		}
		sb.append("YES");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if (x != y) parent[y] = x;
	}

	private static boolean find(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}

	private static int getParent(int x) {
		// TODO Auto-generated method stub
		if (parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
}
