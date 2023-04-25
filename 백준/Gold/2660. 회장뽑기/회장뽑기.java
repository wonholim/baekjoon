
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n + 1];
		int min = Integer.MAX_VALUE;
		ArrayList<Integer>[] list = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1)
				break;
			list[a].add(b);
			list[b].add(a);
		}
		for (int i = 1; i < n + 1; i++) {
			Queue<int[]> q = new ArrayDeque<>();
			q.offer(new int[] { i, 0 });
			boolean[] d = new boolean[n + 1];
			d[i] = true;
			int count = 0;
			while (!q.isEmpty()) {
				int[] g = q.poll();
				count = Math.max(g[1], count);
				for (int k : list[g[0]]) {
					if (!d[k]) {
						d[k] = true;
						q.offer(new int[] { k, g[1] + 1 });
					}
				}
			}
			min = Math.min(min, count);
			c[i] = count;
		}
		int cnt = 0;
		for (int i = 1; i < n + 1; i++) {
			if (c[i] == min) {
				cnt++;
				sb.append(i + " ");
			}
		}
		System.out.println(min + " " + cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}