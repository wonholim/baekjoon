import java.io.*;
import java.util.*;
public class Main {
	static class Info implements Comparable<Info>{
		int i; int j; int v; public Info(int i, int j, int v) {this.i = i; this.j = j; this.v = v;}
		@Override
		public int compareTo(Info o) {
			// TODO Auto-generated method stub
			return o.v - this.v;
		} 
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Info> pq = new PriorityQueue<>();
		int n = Integer.parseInt(br.readLine());
		boolean[][] d = new boolean[n][5];
		int[] c = new int[5];
		for (int i = 0 ; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				d[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				int st = 0;
				for (int k = 0; k < n; k++) {
					if (d[k][i] && d[k][j]) st++;
				}
				pq.offer(new Info(i, j, st));
			}
		}
		Info ans = pq.poll();
		System.out.println(ans.v);
		for (int i = 0; i < 5; i++) {
			if (i == ans.i || i == ans.j) System.out.print("1 ");
			else System.out.print("0 ");
		}
	}
}
