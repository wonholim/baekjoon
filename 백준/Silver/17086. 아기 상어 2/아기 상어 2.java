
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
	static int[] dx = {1,1,-1,-1,1,-1,0,0};
	static int[] dy = {1,-1,1,-1,0,0,1,-1};	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		q = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				if(c[i][j] == 1) {
					d[i][j] = true;
					q.offer(new int[] {i, j, 0});
				}
			}
		}
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 8; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && i < a && j >= 0 && j < b) {
					if(!d[i][j]) {
						d[i][j] = true;
						c[i][j] = g[2] + 1;
						q.offer(new int[] {i, j, g[2] + 1});
					}
				}
			}
		}
		int max = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(c[i][j] > max) max = c[i][j];
			}
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
