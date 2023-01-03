

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
	static int[] c;
	static Queue<int[]> q;
	static boolean[] d;
	static Map<Integer, Integer> map;
	static int[] dx = {1,2,3,4,5,6};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		d = new boolean[201];
		c = new int[201];
		map = new HashMap<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map.put(x, y);
		}
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map.put(x, y);
		}
		q = new ArrayDeque<>();
		d[1] = true;
		q.offer(new int[] {1, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			for(int i = 0; i < 6; i++) {
				int w = g[0] + dx[i];
				if(w >= 1 && w < 201) {
					if(!d[w]) {
						d[w] = true;
						if(map.get(w) == null) {
							c[w] = g[1] + 1;
							q.offer(new int[] {w, g[1] + 1});
						}else {
							d[map.get(w)] = true;
							c[map.get(w)] = g[1] + 1; 
							q.offer(new int[] {map.get(w), g[1] + 1});
						}
					}
				}
			}
		}
		sb.append(c[100]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
