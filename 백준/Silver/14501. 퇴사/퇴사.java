import java.io.*;
import java.util.*;

public class Main {
	static class Counsel {int t; int p; public Counsel(int t, int p) {this.t = t; this.p = p;}}
	static Counsel[] counseling;
	static int max = 0;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		counseling = new Counsel[n + 1];
		for (int i = 1; i <= n; i++) {
			 st = new StringTokenizer(br.readLine());
			 int t = Integer.parseInt(st.nextToken());
			 int p = Integer.parseInt(st.nextToken());
			 counseling[i] = new Counsel(t, p);
		}
		dfs(1, 0);
		System.out.println(max);
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if (i + 1 > counseling.length || i + counseling[i].t > counseling.length) {
			if (i < counseling.length) dfs(i + 1, j);
			max = Math.max(max, j);
			return;
		}
		dfs(i + counseling[i].t, j + counseling[i].p);
		dfs(i + 1, j);
	}
}