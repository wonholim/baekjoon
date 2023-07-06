import java.io.*;
import java.util.*;

public class Main {
	static List<Integer>[] list;
	static Queue<Integer> q = new ArrayDeque<>();
	static boolean[] visited;
	static boolean[] color;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while (t --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			list = new ArrayList[n + 1];
			visited = new boolean[n + 1];
			color = new boolean[n + 1];
			for (int i = 1; i < n + 1; i++) {
				list[i] = new ArrayList<>();
			}
			
			while (m --> 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				list[x].add(y);
				list[y].add(x);
			}
			
			for (int i = 1; i < n + 1; i++) {
				if(visited[i]) continue;
				visited[i] = true;
				color[i] = true;
				q.offer(i);
				while (!q.isEmpty()) {
					int k = q.poll();
					for (int next : list[k]) {
						if(visited[next]) continue;
						visited[next] = true;
						color[next] = !color[k];
						q.offer(next);
					}
				}
			}
			
			boolean checkColor = false;
			Outer :
			for (int i = 1; i < n + 1; i++) {
				boolean myColor = color[i];
				for (int next : list[i]) {
					if (myColor == color[next]) {
						checkColor = true;
						break Outer;
					}
				}
			}
			if (checkColor) sb.append("impossible");
			else sb.append("possible");
			
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}