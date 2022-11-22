

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static class Node{
		int from;
		long dist;
		public Node(int from, long dist) {
			this.from = from;
			this.dist = dist;
		}
	}
	static int n;
	static ArrayList<Node>[] list;
	static long[] dis;
	static long INF = 1000000000;
	static boolean check;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		check = true;
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			list = new ArrayList[n + 1];
			for(int i = 1; i < n + 1; i++) {
				list[i] = new ArrayList<>();
			}
			int m = Integer.parseInt(st.nextToken());
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int dist = Integer.parseInt(st.nextToken());
				list[i].add(new Node(j, dist));
			}
			bellmanFord(1);
			if(!check) sb.append(-1);
			else {
				for(int i = 2; i < n + 1; i++) {
					if(dis[i] != INF) sb.append(dis[i] + "\n");
					else sb.append("-1\n");
				}
			}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bellmanFord(int x) {
		// TODO Auto-generated method stub
		dis = new long[n + 1];
		Arrays.fill(dis, INF);
		dis[x] = 0;
		// 정점과 정점의 최단거리 구하기
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				for(Node next : list[j]) {
					if(dis[j] == INF) continue;
					if(dis[next.from] > dis[j] + next.dist) {
						dis[next.from] = dis[j] + next.dist;
					}
				}
			}
		}
		// 최단 거리를 구한 후에도 음수가 갱신된다면.. 음수사이클이 있다는 것을 알수 있다.
		// 음수 사이클 체크
		for(int j = 1; j < n + 1; j++) {
			for(Node next : list[j]) {
				if(dis[j] == INF) continue;
				if(dis[next.from] > dis[j] + next.dist) {
					check = false;
					break;
				}
			}
			if(!check) break;
		}
	}
}
