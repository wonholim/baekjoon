
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static char[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		parent = new int[n * m];
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		for(int i = 0; i < n * m; i++) parent[i] = i;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int point1 = i * m + j;
				int dx = i;
				int dy = j;
				if(c[i][j] == 'N') {
					dx--;
				}else if(c[i][j] == 'S') {
					dx++;
				}else if(c[i][j] == 'W') {
					dy--;
				}else {
					dy++;
				}
				int point2 = dx * m + dy;
				if(!find(point1, point2)) {
					unionParent(point1, point2);
				}
			}
		}
		Set<Integer> s = new HashSet<>();
		for(int i = 0; i < n * m; i++) {
			s.add(getParent(i));
		}
		sb.append(s.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean find(int x, int y) {
		return getParent(x) == getParent(y) ? true : false;
	}
	public static int getParent(int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
	public static void unionParent(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if(x > y) parent[x] = y;
		else parent[y] = x;
	}
}
