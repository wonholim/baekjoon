

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int[][] c;
	static boolean[][] d;
	static Queue<int[]> q;
	static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dy = {0, 0, 1, -1, 1, -1, -1, 1};
	static int count = 0;
	static int min = 1;
	static boolean check;
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[a][b];
		q = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		check = false;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(c[i][j] != 0 && !d[i][j]) {
					check = true;
					dfs(i, j);
					if(check) count++;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		d[i][j] = true; // 자기 자신을 방문체
		for(int k = 0; k < 8; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < a && w < b) {
					if(c[q][w] != 0) {
						if(c[q][w] > c[i][j]) check = false; // 자기자신 보다 8방향에 큰값이 있다면 산봉우리가 아니다.
						if(!d[q][w] && c[q][w] == c[i][j]) { // 자기자신과 같고 방문하지 않았다면 같은 높이다.
							dfs(q, w); // 같은 높이방문 체크 밑 자기 보다 높은 곳이 있는지 확
						}
					}
			}
		}
	}

}
