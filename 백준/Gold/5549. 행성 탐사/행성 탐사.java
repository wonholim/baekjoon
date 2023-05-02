
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
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] c = new char[n][m];
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++)
			c[i] = br.readLine().toCharArray();
		int[][] j = new int[n + 1][m + 1];
		int[][] o = new int[n + 1][m + 1];
		int[][] i = new int[n + 1][m + 1];
		for (int a = 1; a < n + 1; a++) {
			for (int b = 1; b < m + 1; b++) {
				if (c[a - 1][b - 1] == 'J') {
					j[a][b] = 1;
				} else if (c[a - 1][b - 1] == 'O') {
					o[a][b] = 1;
				} else {
					i[a][b] = 1;
				}
				j[a][b] += j[a - 1][b] + j[a][b - 1] - j[a - 1][b - 1];
				o[a][b] += o[a - 1][b] + o[a][b - 1] - o[a - 1][b - 1];
				i[a][b] += i[a - 1][b] + i[a][b - 1] - i[a - 1][b - 1];
			}
		}
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			int a = j[xx][yy] - j[x][yy] - j[xx][y] + j[x][y];
			int b = o[xx][yy] - o[x][yy] - o[xx][y] + o[x][y];
			int d = i[xx][yy] - i[x][yy] - i[xx][y] + i[x][y];
			sb.append(a).append(" ").append(b).append(" ").append(d).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}