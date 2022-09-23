import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;
	static ArrayList<Integer>[] link;
	static long[] ce;
	static int count = 1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		link = new ArrayList[b + 1];
		check = new boolean[b + 1];
		ce = new long[b + 1];
		for(int i = 1; i <= b; i++) {
			link[i] = new ArrayList<>();
		}
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			link[d].add(e);
			link[e].add(d);
		}
		for(int i = 1; i <= b; i++) {
			Collections.sort(link[i]);
		}
		bfs(g);
		for(int i = 1; i <= b; i++) {
			sb.append(ce[i] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs(int i) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(i);
		ce[i] = count++;
		while(!q.isEmpty()) {
			int get = q.poll();
			for(int k : link[get]) {
				if(ce[k] == 0) {
					ce[k] = count++;
					q.offer(k);
				}
			}
		}
	}

}