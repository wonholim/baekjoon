

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
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			check = true;
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			list = new ArrayList[n + 1];
			for(int i = 1; i < n + 1; i++) {
				list[i] = new ArrayList<>();
			}
			int m = Integer.parseInt(st.nextToken());
			int hall = Integer.parseInt(st.nextToken());
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int dist = Integer.parseInt(st.nextToken());
				list[i].add(new Node(j, dist));
				list[j].add(new Node(i, dist));
			}
			while(hall --> 0) {
				st = new StringTokenizer(br.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int dist = Integer.parseInt(st.nextToken());
				list[i].add(new Node(j, dist * -1));
			}
			
			for(int i = 1; i < n + 1; i++) {
				bellmanFord(i);
				if(!check) break;
			}
			if(!check) sb.append("YES\n");
			else sb.append("NO\n");
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
		for(int i = 1; i < n + 1; i++) {
			boolean check2 = false;
			for(int j = 1; j < n + 1; j++) {
				for(Node next : list[j]) {
					if(dis[j] == INF)continue;
					if(dis[next.from] > dis[j] + next.dist) {
						dis[next.from] = dis[j] + next.dist;
						check2 = true;
					}
				}
			}
			if(!check2) break;
		}
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
