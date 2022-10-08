import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int[][] c;
	static boolean[][] d;
	static ArrayList<Integer> list;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		a = Integer.parseInt(br.readLine());
		c = new int[a][a];
		d = new boolean[a][a];
		list = new ArrayList<>();
		count = 0;
		for(int i = 0; i < a; i++) {
			String b = br.readLine();
			for(int j = 0; j < a; j++) {
				if(b.charAt(j) == '1') {
					c[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(c[i][j] == 1 && !d[i][j]) {
					d[i][j] = true;
					count++;
					dfs(i, j);
					list.add(count);
					count = 0;
				}
			}
		}
		Collections.sort(list);
		sb.append(list.size() + "\n");
		for(int k : list) {
			sb.append(k + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int g = i + dx[k];
			int q = j + dy[k];
			if(g >= 0 && q >= 0 && g < a && q < a) {
				if(c[g][q] == 1 && !d[g][q]) {
					d[g][q] = true;
					dfs(g, q);
					count++;
				}
			}
		}
	}

}
