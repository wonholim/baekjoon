
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
	static class Ton{
		int x;
		int y;
		public Ton(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int[][] c;
	static int n;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static int[] dir;
	static double[] per = {0.05, 0.1, 0.1, 0.07, 0.07, 0.02, 0.02, 0.01, 0.01};
	static int cur = 0;
	static Ton t;
	static long sum = 0;
	static ArrayList<int[]> dxP;
	static ArrayList<int[]> dyP;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		dir = new int[2 * n - 1];	
		dxP = new ArrayList<>();
		dyP = new ArrayList<>();
		dxP.add(new int[] {0, -1, 1, -1, 1, -2, 2, -1, 1});
		dyP.add(new int[] {-1, 0, 0, 1, 1, 1, 1, 2, 2});
		dxP.add(new int[] {1, 0, 0, -1, -1, -1, -1, -2, -2});
		dyP.add(new int[] {0, -1, 1, -1, 1, -2, 2, -1, 1});
		dxP.add(new int[] {0, -1, 1, -1, 1, -2, 2, -1, 1});
		dyP.add(new int[] {1, 0, 0, -1, -1, -1, -1, -2, -2});
		dxP.add(new int[] {-1, 0, 0, 1, 1, 1, 1, 2, 2});
		dyP.add(new int[] {0, -1, 1, -1, 1, -2, 2, -1, 1});
		
		int cnt = 1;
		for(int i = 0; i < 2 * n - 2; i += 2) {
			dir[i] = dir[i + 1] = cnt++;
		}
		dir[2 * n - 2] = cnt - 1;
		c = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		t = new Ton(n / 2, n / 2);
		moveTon();
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void shaking(int xx, int yy, int x, int y, int d) {
		// TODO Auto-generated method stub
		int[] ddx = dxP.get(d);
		int[] ddy = dyP.get(d);
		boolean check = false;
		long dis = 0;
		if(x < 0 || y < 0 || x > n - 1 || y > n - 1) check = true;
		for(int k = 0; k < 9; k++) {
			int i = x + ddx[k];
			int j = y + ddy[k];
			if(i >= 0 && j >= 0 && i < n && j < n) {
				c[i][j] += (int) Math.floor((double)c[xx][yy] * per[k]);
				dis += (int) Math.floor((double)c[xx][yy] * per[k]);  
			}else {
				sum += (int) Math.floor((double)c[xx][yy] * per[k]);
				dis += (int) Math.floor((double)c[xx][yy] * per[k]);
			}
		}
		c[xx][yy] -= dis;
		if(check) sum += c[xx][yy];
		else c[x][y] += c[xx][yy];
		c[xx][yy] = 0;
	}
	private static void moveTon() {
		// TODO Auto-generated method stub
		for(int i = 0; i < dir.length; i++) {
			for(int k = 0; k < dir[i]; k++) {
				t.x = t.x + dx[cur % 4];
				t.y = t.y + dy[cur % 4];
				int q = t.x + dx[cur % 4];
				int w = t.y + dy[cur % 4];
				shaking(t.x, t.y ,q, w, cur % 4);
			}
			cur++;
		}
	}

}
