
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static List<Integer>[] list;
	static int n;
	static Queue<int[]> q;
	static boolean[] apple;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		list = new ArrayList[t];
		q = new ArrayDeque<>();
		for(int i = 0; i < t; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 1; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
		}
		apple = new boolean[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			apple[i] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
		}
		visit = new boolean[t];
		q.offer(new int[] {0, 0});
		visit[0] = true;
		int count = 0;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[1] <= n && apple[g[0]]) {
				count++;
			}
			for(int k : list[g[0]]) {
				if(!visit[k]) {
					visit[k] = true;
					q.offer(new int[] {k , g[1] + 1});
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
