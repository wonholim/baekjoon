
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int a;
	static int b;
	static int[][] c;
	static Queue<int[]> q;
	/* BFS
	 * 배열 선언
	 * 하나에 9가지 방향 tmp 가 자기자신 보다 크면 큐에넣고 마지막에 0 처리
     * TLE
     * 모래성이 아닌 곳으로 처리.. 이런;
	 * */
	static Queue<int[]> qq;
	static int count = 0;
	static int[] dx = {1,-1,0,0,1,1,-1,-1};
	static int[] dy = {0,0,1,-1,1,-1,-1,1};
	static boolean[][] d;
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
		qq = new ArrayDeque<>();
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < b; j++) {
				if(g.charAt(j) != '.') {
					c[i][j] = g.charAt(j) - '0';
				}else {
					d[i][j] = true;
					q.offer(new int[] {i, j});
				}
			}
		}	
		while(!q.isEmpty()) {
			int wr = q.size();
			while(wr --> 0) {
				int[] g = q.poll();
				for(int k = 0; k < 8; k++) {
					int i = g[0] + dx[k];
					int j = g[1] + dy[k];
					if(i >= 0 && j >= 0 && i < a && j < b) {
						if(c[i][j] != 0) {
							c[i][j]--;
							if(c[i][j] == 0) {
								q.offer(new int[] {i, j});
							}
						}
					}
				}

			}
			count++;
		}
		sb.append(count - 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}

