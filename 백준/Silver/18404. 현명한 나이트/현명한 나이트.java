
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-2,-2,-1,-1,1,1,2,2};
	static int[] dy = {-1,1,-2,2,-2,2,-1,1};
	static Queue<int[]> q;
	static int a;
	static int[][] c;
	static boolean[][] d;
	static ArrayList<int[]> list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		c = new int[a][a];
		d = new boolean[a][a];
		list = new ArrayList<>();
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken()) - 1;
		int f = Integer.parseInt(st.nextToken()) - 1;
		d[e][f] = true;
		q.offer(new int[] {e, f, 0});
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken()) - 1;
			int h = Integer.parseInt(st.nextToken()) - 1;
			list.add(new int[] {g, h});
		}
		while(!q.isEmpty()) {
			int[] r = q.poll();
			for(int k = 0; k < 8; k++) {
				int i = r[0] + dx[k];
				int j = r[1] + dy[k];
				if(i >= 0 && j >= 0 && i < a && j < a) {
					if(!d[i][j]) {
						d[i][j] = true;
						c[i][j] = r[2] + 1;
						q.offer(new int[] {i, j, c[i][j]});
					}
				}
			}
		}
		for(int[] g : list) {
			sb.append(c[g[0]][g[1]] + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
