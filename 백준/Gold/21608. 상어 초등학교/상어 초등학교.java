
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Point implements Comparable<Point>{
		int x;
		int y;
		int count;
		int f;
		public Point(int x, int y, int count, int f) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.f = f;
		}
		@Override
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			if(this.f == o.f) {
				if(this.count == o.count) {
					if(this.x == o.x) {
						return this.y - o.y;
					}
					return this.x - o.x;
				}
				return o.count - this.count;
			}
			return o.f - this.f;
		}
	}
	static int n;
	static int n2;
	static int[][] c;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static ArrayList<Point> point;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = new int[n][n];
		point = new ArrayList<>();
		list = new ArrayList[n * n + 1];
		for(int i = 1; i < n * n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i < n * n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			for(int k = 0; k < 4; k++) {
				int g = Integer.parseInt(st.nextToken());
				list[s].add(g);
			}
			for(int q = 0; q < n; q++) {
				for(int w = 0; w < n; w++) {
					if(c[q][w] != 0) continue;
					point.add(dfs(q, w, s));
				}
			}
			if(point.isEmpty()) {
				for(int q = 0; q < n; q++) {
					for(int w = 0; w < n; w++) {
						if(c[q][w] != 0) continue;
						point.add(dfs(q, w, s));
					}
				}
			}
			Collections.sort(point);
			Point p = point.get(0);
			c[p.x][p.y] = s;
			point.clear();
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				Point tmp = dfs(i, j, c[i][j]);
				if(tmp.f == 0) continue;
				sum += (int) Math.pow(10, tmp.f - 1);
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static Point dfs(int i, int j, int s) {
		// TODO Auto-generated method stub
		Point tmp = new Point(i, j, 0, 0);
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < n) {
				if(c[q][w] == 0) {
					tmp.count++;
				}else {
					for(int g : list[s]) {
						if(c[q][w] == g) {
							tmp.f++;
						}
					}
				}
			}
		}
		return tmp;
	}

}
