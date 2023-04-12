
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static boolean[][] dd;
	static ArrayList<Integer> list;
	static int[] dx = {1, 0, -1, 0, 0, 1, 1};
	static int[] dy = {0, -1, 0, 1, 1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		dd = new boolean[1001][1001];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			list.add(d);
			while(g --> 0) {
				for(int j = list.size() - 1; j >= 0; j--) {
					list.add((list.get(j) + 1) % 4);
				}
			}
			dd[x][y] = true;
			for(int q : list) {
				x += dx[q];
				y += dy[q];
				dd[x][y] = true;
			}
			list.clear();
		}
		
		int sum = 0;
		for(int i = 0; i < 1001; i++) {
			for(int j = 0; j < 1001; j++) {
				if(dd[i][j]) sum += dfs(i, j);
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dfs(int i, int j) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int k = 4; k < 7; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < 1001 && w < 1001) {
				if(dd[q][w]) cnt++;
			}
		}
		return cnt == 3 ? 1 : 0;
	}
}
