
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static long max = 0;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] c = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		go(c, 0);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void go(int[][] c, int depth) {
		// TODO Auto-generated method stub
		if(depth == 6) {return;}
		else {
			for(int i = 0; i < c.length; i++) {
				for(int j = 0; j < c.length; j++) {
					max = Math.max(max, c[i][j]);
				}
			}
		}
		for(int k = 0; k < 4; k++) {
			int[][] tmp = new int[c.length][c.length];
			for(int i = 0; i < c.length; i++) {
				for(int j = 0; j < c.length; j++) {
					tmp[i][j] = c[i][j];
				}
			}
			tmp = plus(tmp, k);
			go(tmp, depth + 1);
		}
	}

	private static int[][] plus(int[][] tmp, int k) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new ArrayDeque<>();
		boolean[][] d = new boolean[tmp.length][tmp.length];
		if(k == 0) {
			for(int i = 0; i < tmp.length; i++) {
				for(int j = 0; j < tmp.length; j++) {
					if(tmp[i][j] != 0) {
						q.offer(new int[] {i, j, k});
					}
				}
			}
		}else if(k == 1) {
			for(int i = tmp.length - 1; i >= 0; i--) {
				for(int j = tmp.length - 1; j >= 0; j--) {
					if(tmp[i][j] != 0) {
						q.offer(new int[] {i, j, k});
					}
				}
			}
		}else if(k == 2) {
			for(int i = 0; i < tmp.length; i++) {
				for(int j = 0; j < tmp.length; j++) {
					if(tmp[j][i] != 0) {
						q.offer(new int[] {j, i, k});
					}
				}
			}
		}else {
			for(int i = tmp.length - 1; i >= 0; i--) {
				for(int j = tmp.length - 1; j >= 0; j--) {
					if(tmp[j][i] != 0) {
						q.offer(new int[] {j, i, k});
					}
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			int i = g[0] + dx[g[2]];
			int j = g[1] + dy[g[2]];
			if(i >= 0 && j >= 0 && i < tmp.length && j < tmp.length) {
				if(tmp[i][j] == 0) {
					tmp[i][j] = tmp[g[0]][g[1]];
					tmp[g[0]][g[1]] = 0;
					if(d[g[0]][g[1]]) { d[i][j] = true; d[g[0]][g[1]] = false; }
					q.offer(new int[] {i, j, g[2]});
				}else if((tmp[i][j] == tmp[g[0]][g[1]]) && (!d[i][j] && !d[g[0]][g[1]])) {
					d[i][j] = true;
					tmp[i][j] = 2 * tmp[i][j];
					tmp[g[0]][g[1]] = 0;
					q.offer(new int[] {i, j, g[2]});
				}
			}
		}
		return tmp;
	}
}
