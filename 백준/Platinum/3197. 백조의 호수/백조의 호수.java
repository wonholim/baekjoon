

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
 * Char 형으로 메모리를 줄임
 * 물을 탐색할때 다음 1이 0으로 바뀔경우 큐에 넣어 시간을 줄임
 * BFS시 백조또한 0은 이미 돌아다닐수 있으므로 앞으로 1이 0이될때를 큐에 넣어줌
 * 시간초과???
 * 추가 : 백조 밑 또한 물임...
 * 방문체크 막갈기고 체크 못해서 2시간버림..
 * */
public class Main {
	static int a;
	static int b;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static char[][] c;
	static boolean[][] d;
	static int[] s;
	static int[] l;
	static Queue<int[]> q;
	static Queue<int[]> qq;
	static boolean check = false;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new char[a][b];
		d = new boolean[a][b];
		s = new int[2];
		l = new int[2];
		q = new ArrayDeque<>();
		qq = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				c[i][j] = g.charAt(j);
				if(c[i][j] == 'L' && !check) {
					check = true;
					s[0] = i;
					s[1] = j;
					q.offer(new int[] {i, j});
				}else if(c[i][j] == 'L' && check) {
					l[0] = i;
					l[1] = j;
					q.offer(new int[] {i, j});
				}else if(c[i][j] == '.') {
					q.offer(new int[] {i, j});
				}
			}
		}
		d[s[0]][s[1]] = true;
		qq.offer(new int[] {s[0], s[1]});
		while(true) {
			
			if(isMeet()) break;
			
			count++;
			
			int er = q.size();
			while(er --> 0) {
				int[] g = q.poll();
				for(int k = 0; k < 4; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(c[i][j] == 'X') {
							c[i][j] = '.';
							q.offer(new int[] {i, j});
						}
					}
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean isMeet() {
		// TODO Auto-generated method stub
		Queue<int[]> tmpQ = new ArrayDeque<>();
		while(!qq.isEmpty()) {
			int[] g = qq.poll();
			if(g[0] == l[0] && g[1] == l[1]) return true;
			for(int k = 0; k < 4; k++) {
				int i = g[0] + dx[k];
				int j = g[1] + dy[k];
	
				if(i < 0 || j < 0 || i >= a || j >= b) continue;
				if(d[i][j]) continue;
					
				d[i][j] = true;
				if(c[i][j] == '.') {
					qq.offer(new int[] {i, j});
				}else if(c[i][j] == 'X') {
					tmpQ.offer(new int[] {i, j});
				}else if(c[i][j] == 'L') {
					return true;
				}
			}
		}
		qq = tmpQ;
		return false;
	}
}
