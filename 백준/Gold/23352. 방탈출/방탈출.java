
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int n;
	static int m;
	static int[][] c;
	static boolean[][] d;
	static List<int[]> list;
	static Queue<int[]> q;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new int[n][m];
		d = new boolean[n][m];
		list = new ArrayList<>();
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(c[i][j] != 0) {
					q.offer(new int[] {i, j, 0});
					d = new boolean[n][m];
					d[i][j] = true;
					while(!q.isEmpty()) {
						int[] g = q.poll();
						list.add(new int[] {c[i][j] + c[g[0]][g[1]], g[2]});
						for(int k = 0; k < 4; k++) {
							int a = g[0] + dx[k];
							int b = g[1] + dy[k];
							if(a >= 0 && b >= 0 && a < n && b < m) {
								if(c[a][b] != 0 && !d[a][b]) {
									d[a][b] = true;
									q.add(new int[] {a, b, g[2] + 1});
								}
							}
						}
					}
				}
			}
		}
		Collections.sort(list, new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) {
					return o2[0] - o1[0];
				}
				return o2[1] - o1[1];
			}
			
		});
		sb.append(list.get(0) == null ? 0 : list.get(0)[0]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
