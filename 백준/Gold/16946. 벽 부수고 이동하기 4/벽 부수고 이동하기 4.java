
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static char[][] c;
	static boolean[][] d;
	static int count;
	static int sum;
	static int[][] cc;
	static Map<Integer, Integer> map;
	static Set<Integer> s;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		cc = new int[n][m];
		map = new HashMap<>();
		s = new HashSet<>();
		for(int i = 0; i < n; i++) { 
			c[i] = br.readLine().toCharArray();
		}
		d = new boolean[n][m];
		int tmp = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(c[i][j] == '0' && !d[i][j]) {
					d[i][j] = true;
					cc[i][j] = tmp;
					count = 1;
					dfs(i, j, tmp);
					map.put(tmp, count);
					tmp++;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(cc[i][j] == 0) {
					sum = 1;
					four(i, j);
					for(int k : s) {
						sum += map.get(k);
					}
					sb.append(sum % 10);
					s.clear();
				}else {
					sb.append("0");
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void four(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(cc[q][w] != 0) {
					s.add(cc[q][w]);
				}
			}
		}
	}
	private static void dfs(int i, int j, int tmp) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < m) {
				if(c[q][w] == '0' && !d[q][w]) {
					d[q][w] = true;
					count++;
					cc[q][w] = tmp;
					dfs(q, w, tmp);
				}
			}
		}
	}

}
