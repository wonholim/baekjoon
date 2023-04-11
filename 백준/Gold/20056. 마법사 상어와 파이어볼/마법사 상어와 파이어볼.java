
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static class Fire{
		int r;
		int c;
		int m;
		int s;
		int d;
		public Fire(int r, int c, int m, int s, int d) {
			this.r = r;
			this.c = c;
			this.m = m;
			this.s = s;
			this.d = d;
		}
	}
	static int n;
	static int m;
	static int k;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static Queue<Fire> q;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		map = new int[n][n];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()) - 1;
			int c = Integer.parseInt(st.nextToken()) - 1;
			int m = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			q.offer(new Fire(r, c, m, s, d));
		}
		while(k --> 0) {
			int size = q.size();
			while(size --> 0) {
				Fire f = q.poll();
				int x = f.r + (dx[f.d] * (f.s % n));
				int y = f.c + (dy[f.d] * (f.s % n));
				if(x > n - 1) x = x - n;
				if(x < 0) x = x + n;
				if(y > n - 1) y = y - n;
				if(y < 0) y = y + n;
				map[x][y]++;
				q.offer(new Fire(x, y, f.m, f.s, f.d));
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(map[i][j] >= 2) {
						int count = 0;
						int len = q.size();
						int sumM = 0;
						int sumS = 0;
						boolean odd = true;
						boolean even = true;
						while(len --> 0) {
							Fire f = q.poll();
							if(f.r == i && f.c == j) {
								sumM += f.m;
								sumS += f.s;
								count++;
								if(f.d % 2 == 0) odd = false;
								else even = false;
							}else {
								q.offer(f);
							}
						}
						sumM = (int) Math.floor((double)sumM / 5);
						sumS = (int) Math.floor((double)sumS / count);
						if(sumM == 0) continue;
						int l = 1;
						if(odd || even) l = 0;
						for(; l < 8; l += 2) {
							q.add(new Fire(i, j, sumM, sumS, l));
						}
					}
				}
			}
			map = new int[n][n];
		}
		int sum = 0;
		while(!q.isEmpty()) {
			Fire f = q.poll();
			sum += f.m;
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
