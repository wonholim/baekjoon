import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int a;
	static int b;
	static int[][] c;
	static boolean[] d;
	static int count;
	static int max;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = new int[a][b];
		d = new boolean[26];
		count = 0;
		max = 0;
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				c[i][j] = g.charAt(j) - 'A';
			}
		}
		dfs(0, 0);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(d[c[i][j]]) {
			max = Math.max(count, max);
			return;
		}else {
			d[c[i][j]] = true;
			for(int k = 0; k < 4; k++) {
				int q = i + dx[k];
				int w = j + dy[k];
				if(q >= 0 && w >= 0 && q < a && w < b) {
					count++;
					dfs(q, w);
					count--;
				}
			}
			d[c[i][j]] = false;
		}
	}


}
