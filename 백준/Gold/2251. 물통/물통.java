import java.io.*;
import java.util.*;
public class Main {
	static int[] box = new int[3];
	static ArrayDeque<int[]> q = new ArrayDeque<>();
	static TreeSet<Integer> ts = new TreeSet<>();
	static Map<String, Integer> m = new HashMap<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) box[i] = Integer.parseInt(st.nextToken());
		q.offer(new int[] {0, 0, box[2]});
		m.put(new String(box[0] + " " + box[1] + " " + box[2]), 0);
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == 0) ts.add(g[2]);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j) continue;
					bfs(i, j, g);
				}
			}
		}
		for(Integer k : ts) sb.append(k + " ");
		System.out.println(sb.toString());
	}
	private static void bfs(int i, int j, int[] tmp) {
		// TODO Auto-generated method stub
		int[] g = new int[3];
		for(int k = 0; k < 3; k++) g[k] = tmp[k];
		if(g[i] == 0) return;
		if (g[i] + g[j] <= box[j]) {
			g[j] += g[i];
			g[i] = 0;
		} else {
			g[i] = (g[i] + g[j]) - box[j];
			g[j] = box[j];
		}
		String line = g[0] + " " + g[1] + " " + g[2];
		if(m.get(line) != null) return;
		m.put(line, 0);
		q.offer(g);
	}
}
