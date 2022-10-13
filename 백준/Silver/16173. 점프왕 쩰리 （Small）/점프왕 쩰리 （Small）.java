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
	static int[][] c;
	static boolean[][] d;
	static Queue<int[]> q;
	static int[] dx = {0, 1};
	static int[] dy = {1, 0};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		c = new int[a ][a];
		d = new boolean[a][a];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < a; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		q = new ArrayDeque<>();
		d[0][0] = true;
		q.offer(new int[] {0, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 2; k++) {
				int e = g[0] + c[g[0]][g[1]] * dx[k];
				int w = g[1] + c[g[0]][g[1]] * dy[k];
				if(e >= 0 && w >= 0 && e < a && w < a) {
					if(!d[e][w]) {
						d[e][w] = true;
						q.offer(new int[] {e, w});
					}
				}
			}
		}
		if(d[a - 1][a - 1]) {
			sb.append("HaruHaru");
		}else {
			sb.append("Hing");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}