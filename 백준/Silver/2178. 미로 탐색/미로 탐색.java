import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[][] c;
	static int[][] d;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new boolean[a][b];
		d = new int[a][b];
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				if(g.charAt(j) == '1') {
					d[i][j] = 1;
				}
			}
		}
		bfs(0, 0);
		sb.append(d[a - 1][b - 1]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {i, j});
		c[i][j] = true;
		int[] checkRoad;
		while(!q.isEmpty()) {
			checkRoad = q.poll();
			for(int k = 0; k < 4; k++) {
				int z = checkRoad[0] + dx[k];
				int x = checkRoad[1] + dy[k];
				if(z >= 0 && x >= 0 && z < d.length && x < d[0].length) {
					if(d[z][x] == 1 && !c[z][x]) {
						c[z][x] = true;
						d[z][x] = d[checkRoad[0]][checkRoad[1]] + 1;
						q.offer(new int[] {z, x});
					}
				}
			}
		}
	}
}