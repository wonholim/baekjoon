

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
	static int[] c;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		q = new ArrayDeque<>();
		c = new int[100001];
		d = new boolean[100001];
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		q.offer(new int[] {a, 0});
		int count = 0;
		int depth = 0;
		boolean check1 = false;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			d[g[0]] = true;
			int i = g[0];
			if(i == b && !check1){
				depth = g[1];
				count++;
				check1 = true;
			}else if(i == b && check1 && g[1] == depth) {
				count++;
			}
			if(i * 2 <= 100000 && !d[i * 2]) {
				q.offer(new int[] {i * 2, g[1] + 1});
			}
			if(i + 1 <= 100000 && !d[i + 1]) {
				q.offer(new int[] {i + 1, g[1] + 1});
			}
			if(i - 1 >= 0 && !d[i - 1]) {
				q.offer(new int[] {i - 1, g[1] + 1});
			}
		}
		sb.append(depth + "\n" + count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
