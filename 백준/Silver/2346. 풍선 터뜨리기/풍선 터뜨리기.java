

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class PS{
		int i, c;
		public PS(int i, int c) {
			this.i = i;
			this.c = c;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<PS> q = new ArrayDeque<>();
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int k = 1; k <= n; k++) {
			q.offer(new PS(k, Integer.parseInt(st.nextToken())));
		}
		PS g = q.poll();
		sb.append(g.i + " ");
		int k = g.c;
		while(!q.isEmpty()) {
			if(k < 0) {
				k *= -1;
				while(k --> 0) {
					q.offerFirst(q.pollLast());
				}
				PS r = q.pollFirst();
				sb.append(r.i + " ");
				k = r.c;
			}else {
				while(k --> 0) {
					q.offerLast(q.pollFirst());
				}
				PS r = q.pollLast();
				sb.append(r.i + " ");
				k = r.c;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
