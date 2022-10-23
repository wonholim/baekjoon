

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> q;
	static int[][] c;
	static boolean[][] d;
	static int a;
	static int b;
	static int[] dx = {-2,-2,2,2,-1,1,1,-1};
	static int[] dy = {-1,1,1,-1,-2,-2,2,2};
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		q = new ArrayDeque<>();
		c = new int[8][8];
		d = new boolean[8][8];
		char[] w = br.readLine().toCharArray();
		q.offer(new int[] {w[0] - 'a', w[1] - '1', 0});
		d[w[0] - 'a'][w[1] - '1'] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 8; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < 8 && j < 8) {
					if(!d[i][j]) {
						d[i][j] = true;
						c[i][j] = g[2] + 1;
						q.offer(new int[] {i, j, g[2] + 1});
					}
				}
			}
		}
		w = br.readLine().toCharArray();
		sb.append(c[w[0] - 'a'][w[1] - '1']);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
