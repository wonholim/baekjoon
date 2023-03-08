

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		int check = 0;
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(!find(x, y)) unionParent(x, y);
			else check++;
		}
		int ans = 0;
		for(int i = 1; i < n + 1; i++) {
			if(getParent(i) == i) {
				ans++;
			}
		}
		sb.append(ans + check - 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static void unionParent(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if (x > y)
			parent[x] = y;
		else
			parent[y] = x;
	}

	public static boolean find(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}

	public static int getParent(int x) {
		if (parent[x] == x)
			return x;
		return parent[x] = getParent(parent[x]);
	}
}
