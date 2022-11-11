

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] d;
	static Queue<int[]> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		d = new boolean[100000];
		q = new ArrayDeque<>();
		d[s] = true;
		q.offer(new int[] {s, 0});
		boolean check = false;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[1] > t) continue;
			if(g[0] == l) {
				sb.append(g[1] + " ");
				check = true;
				break;
			}
			int i = g[0] + 1;
			if(i <= 99999 && !d[i]) {
				d[i] = true;
				q.offer(new int[] {i, g[1] + 1});
			}
			int j = g[0] * 2;
			if(j >= 0 && j <= 99999) {
				j = j - (int)Math.pow(10, Integer.toString(j).length() - 1);
				if(j >= 0 && !d[j]) {
					d[j] = true;
					q.offer(new int[] {j, g[1] + 1});
				}
			}
		}
		if(!check) sb.append("ANG");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
