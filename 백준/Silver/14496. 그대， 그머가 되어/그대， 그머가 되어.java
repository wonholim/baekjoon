

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
	static int x;
	static int y;
	static int a;
	static int b;
	static ArrayList<Integer>[] list;
	static Queue<int[]> q;
	static boolean[] d;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		list = new ArrayList[a + 1];
		d = new boolean[a + 1];
		q = new ArrayDeque<>();
		for (int i = 1; i <= a; i++) {
			list[i] = new ArrayList<>();
		}
		while (b-- > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			list[i].add(j);
			list[j].add(i);
		}
		d[x] = true;
		q.offer(new int[] { x, 0 });
		sb.append(bfs());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int bfs() {
		// TODO Auto-generated method stub
		while (!q.isEmpty()) {
			int[] g = q.poll();
			if (g[0] == y) {
				return g[1];
			}
			for (int k : list[g[0]]) {
				if (!d[k]) {
					d[k] = true;
					q.offer(new int[] { k, g[1] + 1 });
				}
			}
		}
		return -1;
	}

}
