import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	static int m, n;
	static int[][] map;
	static int[][] visited;
	static int[][] dis = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		visited = new int[m][n];
		map = new int[m][n];
		for (int i = 0; i < m; i++) {
			map[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		f(0, 0);
		
		sb.append(visited[0][0] == -1 ? 0 : visited[0][0]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int f(int x, int y) {
		if(x == m - 1 && y == n - 1) {
			visited[x][y] = 1;
			return visited[x][y];
		}
		OUT:
		for (int i = 0; i < dis.length; i++) {
			int nx = x + dis[i][0];
			int ny = y + dis[i][1];
			if (nx >= 0 && ny >= 0 && nx < m && ny < n && map[x][y] > map[nx][ny]) {
				if (visited[nx][ny] == -1) continue;
				if (visited[nx][ny] > 0) {
					visited[x][y] += visited[nx][ny];
					continue OUT;
				}
				int tmp = f(nx, ny);
				visited[x][y] += tmp == -1 ? 0 : tmp;
			}
		}    
		return visited[x][y] = visited[x][y] == 0 ? -1 : visited[x][y];
	}
}