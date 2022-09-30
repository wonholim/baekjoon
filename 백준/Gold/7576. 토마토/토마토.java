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
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> queue;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[b][a];
		d = new boolean[b][a];
		queue = new ArrayDeque<>();
		count = 0;
		for(int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < a; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
				if(c[i][j] == 1) {
					queue.offer(new int[] {i , j});
					d[i][j] = true;
				}
			}
		}
		bfs();
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				if(c[i][j] == 0) {
					System.out.println(-1);
					return;
				}else if(c[i][j] > count){
					count = c[i][j];
				}
			}
		}
		sb.append(count - 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		while(!queue.isEmpty()) {
			int[] g = queue.poll();
			for(int k = 0; k < 4; k++) {
				int q = g[0] + dx[k];
				int w = g[1] + dy[k];
				if(q >= 0 && w >= 0 && q < b && w < a) {
					if(c[q][w] != -1 && !d[q][w]) {
						d[q][w] = true;
						c[q][w] = c[g[0]][g[1]] + 1;
						queue.offer(new int[] {q, w});
					}
				}
			}
		}
	}

}