
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static int[] a;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		a = new int[n + 1]; 
		for(int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			a[x]++;
			a[y]++;
			if(!find(x, y)) {
				unionParent(x, y);
			}
		}
		int path = 0;
		for(int i = 1; i < n + 1; i++) {
			if(a[i] % 2 == 1) path++;
		}
		int k = getParent(1);
		for(int i = 2; i < n + 1; i++) {
			if(k != getParent(i)) {
				System.out.println("NO");
				return;
			}
		}
		if(path == 2 || path == 0) sb.append("YES");
		else sb.append("NO");
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
