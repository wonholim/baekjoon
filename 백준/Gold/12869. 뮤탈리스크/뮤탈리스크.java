

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {9, 9, 3, 3, 1, 1};
	static int[] dy = {3, 1, 9, 1, 9, 3};
	static int[] dz = {1, 3, 1, 9, 3, 9};
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int[] c = new int[3];
		boolean[][][] d = new boolean[61][61][61];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {c[0], c[1], c[2], 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] <= 0 && g[1] <= 0 && g[2] <= 0) {
				sb.append(g[3]);
				break;
			}
			for(int k = 0; k < 6; k++) {
				int x = Math.max(0, g[0] - dx[k]);
				int y = Math.max(0, g[1] - dy[k]);
				int z = Math.max(0, g[2] - dz[k]);
				if(!d[x][y][z]) {
					d[x][y][z] = true;
					q.offer(new int[] {x, y, z, g[3] + 1});
				}
			}
			
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
