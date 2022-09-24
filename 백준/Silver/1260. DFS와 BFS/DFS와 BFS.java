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
	static long[] se;
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
		se = new long[b + 1];
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
		check[g] = true;
		se[1] = g;
		count = 2;
		dfs(g);
		for(int i = 1; i <= b; i++) {
			if(se[i] != 0) {
				sb.append(se[i] + " ");
			}
		}
		sb.append("\n");
		check = new boolean[b + 1];
		count = 1;
		bfs(g);
		for(int i = 1; i <= b; i++) {
			if(ce[i] != 0) {
				sb.append(ce[i] + " ");
			}
		}
		sb.append("\n");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bfs(int i) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(i);
		check[i] = true;
		while(!q.isEmpty()) {
			int get = q.poll();
			ce[count] = get;
			count++;
			for(int k : link[get]) {
				if(!check[k]) {
					check[k] = true;
					q.offer(k);
				}
			}
		}
	}
	private static void dfs(int i) {
		// TODO Auto-generated method stub
		for(int k : link[i]) {
			if(!check[k]) {
				check[k] = true;
				se[count] = k;
				count++;
				dfs(k);
			}
		}
	}

}