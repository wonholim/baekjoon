
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
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
		for(int i = 1; i <= n; i++) {
			sb.append("Scenario " + i + ":\n");
			int k = Integer.parseInt(br.readLine());
			parent = new int[k];
			for(int j = 0; j < k; j++) {
				parent[j] = j;
			}
			int c = Integer.parseInt(br.readLine());
			while (c --> 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				unionParent(x, y);
			}
			c = Integer.parseInt(br.readLine());
			while(c --> 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if(getParent(x) == getParent(y)) sb.append("1\n");
				else sb.append("0\n");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static void unionParent(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if(x > y) parent[x] = y;
		else parent[y] = x;
	}
	public static boolean find(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}
	public static int getParent(int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
}
