

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-2,-2,0,0,2,2};
	static int[] dy = {-1,1,-2,2,-1,1};
	static int[][] c;
	static boolean[][] d;
	static int[] s;
	static int[] l;
	static int a;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		a = Integer.parseInt(br.readLine());
		c = new int[a][a];
		d = new boolean[a][a];
		q = new ArrayDeque<>();
		s = new int[2];
		l = new int[2];
		st = new StringTokenizer(br.readLine());
		s[0] = Integer.parseInt(st.nextToken());
		s[1] = Integer.parseInt(st.nextToken());
		d[s[0]][s[1]] = true;
		q.offer(new int[] {s[0], s[1], 0});
		l[0] = Integer.parseInt(st.nextToken());
		l[1] = Integer.parseInt(st.nextToken());
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 6; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 & i < a && j < a) {
					if(!d[i][j]) {
						d[i][j] = true;
						c[i][j] = g[2] + 1;
						q.offer(new int[] {i, j, c[i][j]});
					}
				}
			}
		}
		if(d[l[0]][l[1]]) sb.append(c[l[0]][l[1]]);
		else sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
