

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> q;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			q = new ArrayDeque<>();
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			q.offer(new int[] {start, end, 0});
				while(!q.isEmpty()) {
					int[] g = q.poll();
					if(g[0] == g[1]) {
						sb.append(g[2] + "\n");
						break;
					}
					if(g[0] > g[1]) continue;
					q.offer(new int[] {g[0] * 2, g[1] + 3, g[2] + 1});
					q.offer(new int[] {g[0] + 1, g[1], g[2] + 1});
				}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
