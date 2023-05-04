
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static char[][] c;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Deque<int[]> q;
	static boolean[][] d;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		d = new boolean[n][m];
		q = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;
		int xx = Integer.parseInt(st.nextToken()) - 1;
		int yy = Integer.parseInt(st.nextToken()) - 1;
		q.offer(new int[] {x, y, 0});
		d[x][y] = true;
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == xx && g[1] == yy) {
				System.out.println(g[2]);
				break;
			}
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < n && j < m) {
					if(!d[i][j]) {
						d[i][j] = true;
						if(c[i][j] == '0') {
							q.offerFirst(new int[] {i, j, g[2]});
						}else{
							q.offer(new int[] {i, j, g[2] + 1});
						}
					}
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
