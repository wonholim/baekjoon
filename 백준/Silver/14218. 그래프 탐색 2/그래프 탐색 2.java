

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<Integer> q;
	static int[][] graph;
	static int n;
	static boolean[] visit;
	static int[] time;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		graph = new int[n + 1][n + 1];
		int m = Integer.parseInt(st.nextToken());
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			graph[i][j] = graph[j][i] = 1;
		}
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			graph[i][j] = graph[j][i] = 1;
			time = new int[n + 1];
			time[1] = 0;
			for(int k = 2; k < n + 1; k++) {
				time[k] = -1;
			}
			q = new ArrayDeque<>();
			q.offer(1);
			bfs();
			for(int k = 1; k < n + 1; k++) {
				sb.append(time[k] + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) {
			int g = q.poll();
			for(int k = 1; k < n + 1; k++) {
				if(graph[g][k] != 0 && time[k] == -1) {
					q.offer(k);
					time[k] = time[g] + 1;
				}
			}
		}
	}


}
