
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] dist;
	static boolean[] visited;
	static int[][] map;
	static int INF = 1_000_000_000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		dist = new int[n + 1];
		Arrays.fill(dist, INF);
		map = new int[n + 1][n + 1];
		visited = new boolean[n + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) map[i][j] = 0;
				else map[i][j] = INF;
			}
		}
		int m = Integer.parseInt(br.readLine());
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			map[start][end] = Math.min(map[start][end], cost);
		}
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		dist[start] = 0;
		visited[start] = true;
		for(int i = 1; i <= n; i++) {
			dist[i] = map[start][i];
		}
		for(int i = 1; i <= n - 2; i++) {
			int cur = getIndex();
			visited[cur] = true;
			for(int j = 1; j <= n; j++) {
				if(!visited[j]) {
					dist[j] = Math.min(dist[j], dist[cur] + map[cur][j]);
				}
			}
		}
		sb.append(dist[end]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int getIndex() {
		// TODO Auto-generated method stub
		int min = INF;
		int index = 1;
		for(int i = 1; i <= n; i++) {
			if(!visited[i] && dist[i] < min) {
				min = dist[i];
				index = i;
			}
		}
		return index;
	}

}
