
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dy = {0, 0, 1, -1, 1, -1, -1, 1};
	static Queue<int[]> q;
	static int a;
	static int b;
	static int[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) break;
			c = new int[a][b];
			q = new ArrayDeque<>();
			for(int i = 0; i < a; i++) {
				String g = br.readLine();
				for(int j = 0; j < b; j++) {
					if(g.charAt(j) == '*') {
						c[i][j] = 99999;
						q.offer(new int[] {i, j});
					}else {
						c[i][j] = 0;
					}
				}
			}
			while(!q.isEmpty()) {
				int[] g = q.poll();
				for(int k = 0; k < 8; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(c[i][j] != 99999) {
							c[i][j]++;
						}
					}
				}
			}
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < b; j++) {
					if(c[i][j] == 99999) {
						sb.append("*");
					}else {
						sb.append(c[i][j]);
					}
				}
				sb.append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
