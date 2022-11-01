

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
	static Queue<int[]> q;
	static int[] c;
	static boolean[] d;
	static int[] visit;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		q = new ArrayDeque<>();
		c = new int[100001];
		visit = new int[100001];
		d = new boolean[100001];
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		q.offer(new int[] {a, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			int i = g[0];
			if(g[0] == b) {
				sb.append(g[1] + "\n");
				break;
			}
			if(i * 2 <= 100000 && !d[i * 2]) {
				d[i * 2] =  true;
				visit[i * 2] = i;
				q.offer(new int[] {i * 2, g[1] + 1});
			}
			if(i + 1 <= 100000 && !d[i + 1]) {
				d[i + 1] = true;
				visit[i + 1] = i;
				q.offer(new int[] {i + 1, g[1] + 1});
			}
			if(i - 1 >= 0 && !d[i - 1]) {
				d[i - 1] = true;
				visit[i - 1] = i;
				q.offer(new int[] {i - 1, g[1] + 1});
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(b);
		int k = b;
		while(k != a) {
			k = visit[k];
			list.add(k);
		}
		for(int i = list.size() - 1; 0 <= i; i--) {
			sb.append(list.get(i) + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
