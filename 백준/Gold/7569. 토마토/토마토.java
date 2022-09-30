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
	static int[][][] c;
	static boolean[][][] d;
	static int[] dx = {0, 0, 1, -1, 0, 0};
	static int[] dy = {0, 0, 0, 0, 1, -1};
	static int[] dz = {1, -1, 0, 0, 0, 0};
	static Queue<int[]> queue;
	static int count;
	static int h;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		c = new int[h][b][a];
		d = new boolean[h][b][a];
		queue = new ArrayDeque<>();
		count = 0;
		for(int k = 0; k < h; k++) {
			for(int i = 0; i < b; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < a; j++) {
					c[k][i][j] = Integer.parseInt(st.nextToken());
					if(c[k][i][j] == 1) {
						queue.offer(new int[] {k , i , j});
						d[k][i][j] = true;
					}
				}
			}
		}
		bfs();
		for(int k = 0; k < h; k++) {
			for(int i = 0; i < b; i++) {
				for(int j = 0; j < a; j++) {
					if(c[k][i][j] == 0) {
						System.out.println(-1);
						return;
					}else if(c[k][i][j] > count){
						count = c[k][i][j];
					}
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
			for(int k = 0; k < 6; k++) {
				int e = g[0] + dz[k];
				int q = g[1] + dx[k];
				int w = g[2] + dy[k];
				if(e >= 0 && q >= 0 && w >= 0 && q < b && w < a && e < h) {
					if(c[e][q][w] != -1 && !d[e][q][w]) {
						d[e][q][w] = true;
						c[e][q][w] = c[g[0]][g[1]][g[2]] + 1;
						queue.offer(new int[] {e, q, w});
					}
				}
			}
		}
	}

}