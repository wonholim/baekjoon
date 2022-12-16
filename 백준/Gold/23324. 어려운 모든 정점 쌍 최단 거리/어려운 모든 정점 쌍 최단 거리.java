
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		int start = 0;
		int last = 0;
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			if(i == k) {
				start = Integer.parseInt(st.nextToken());
				last = Integer.parseInt(st.nextToken());
				continue;
			}
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(!find(x, y)) {
				unionParent(x, y);
			}
		}
		long count = 1;
		int check = parent[1];
		for(int i = 2; i <= n; i++) {
			if(getParent(i) == check) {
				count++;
			}
		}
		if(getParent(start) == getParent(last)) sb.append(0);
		else sb.append(count * (long)(n - count));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if(x < y) parent[y] = parent[x];
		else parent[x] = parent[y];
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
