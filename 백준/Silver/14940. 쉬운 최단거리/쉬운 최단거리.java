import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[][] c;
	static boolean[][] d;
	static Queue<int[]> q = new ArrayDeque<>();
	static int a;
	static int b;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				if(c[i][j] == 2) {
					d[i][j] = true;
					c[i][j] = 0;
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		bfs();
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(d[i][j]) sb.append(c[i][j] + " ");
				else if(!d[i][j] && c[i][j] == 0) sb.append(0 + " ");
				else sb.append(-1 + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >=0 && i < a && j < b) {
					if(c[i][j] != 0 && !d[i][j]) {
						d[i][j] = true;
						c[i][j] = g[2] + 1;
						q.offer(new int[] {i, j, c[i][j]});
					}
				}
			}
		}
	}

}