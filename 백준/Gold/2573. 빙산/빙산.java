
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int[][] c;
	static boolean[][] d;
	static Queue<int[]> q;
	static int count = 0;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int years = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		q = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				if(c[i][j] == 0) {
					q.offer(new int[] {i, j});
				}
			}
		}
		while(true) {
			years = 0;
			boolean check = isClear();
			if(check) break;
			else if(years == 0) {count = 0; break;}
			else count++;
			
			while(!q.isEmpty()) {
				int[] g = q.poll();
				for(int k = 0; k < 4; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(c[i][j] > 0) {
							c[i][j]--;
						}
					}
				}
			}
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < b; j++) {
					if(c[i][j] == 0) {
						q.offer(new int[] {i, j});
					}
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean isClear() {
		// TODO Auto-generated method stub
		d = new boolean[a][b];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(c[i][j] != 0 && !d[i][j]) {
					d[i][j] = true;
					dfs(i, j);
					years++;
					if(years >= 2) return true;
				}
			}
		}
		return false;
	}

	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < a && w < b) {
				if(!d[q][w] && c[q][w] != 0) {
					d[q][w] = true;
					dfs(q, w);
				}
			}
		}
	}

}
