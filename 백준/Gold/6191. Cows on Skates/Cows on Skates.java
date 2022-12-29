

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
	static int x;
	static int y;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static char[][] c;
	static boolean[][] d;
	static Queue<int[]> q;
	static Map<String, String> m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		c = new char[x][y];
		d = new boolean[x][y];
		q = new ArrayDeque<>();
		m = new HashMap<>();
		for(int i = 0; i < x; i++) {
			String line = br.readLine();
			for(int j = 0; j < y; j++) {
				c[i][j] = line.charAt(j);
			}
		}
		q.offer(new int[] {0, 0});
		d[0][0] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
				if(i >= 0 && j >= 0 && i < x && j < y) {
					if(!d[i][j] && c[i][j] != '*') {
						d[i][j] = true;
						m.put((i + 1) + " " + (j + 1), (g[0] + 1) + " " + (g[1] + 1));
						q.offer(new int[] {i, j});
					}
				}
			}
		}
		Stack<String> s = new Stack<>();
		String a = x + " " + y;
		s.push(a);
		while(true) {
			if(m.get(a) == null) break;
			else {
				s.push(m.get(a));
				a = m.get(a);
			}
		}
		while(!s.isEmpty()) sb.append(s.pop() + "\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
