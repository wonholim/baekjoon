

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Print{
		int n;
		int f;
		public Print(int n, int f) {
			this.n = n;
			this.f = f;
		}
	}
	static Queue<Print> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			q = new ArrayDeque<>();
			ArrayList<Integer> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				int k = Integer.parseInt(st.nextToken());
				list.add(k);
				if(count == i) {
					q.offer(new Print(k, 1));
				}else {
					q.offer(new Print(k, 0));
				}
			}
			Collections.sort(list, Collections.reverseOrder());
			int cnt = 0;
			while(!q.isEmpty()) {
				Print g = q.poll();
				if(!list.isEmpty()) {
					if(g.n != list.get(0)) {
						q.offer(g);
					}else {
						if(g.f == 1) {
							sb.append(cnt + 1 + "\n");
							break;
						}else {
							list.remove(0);
							cnt++;
						}
					}
				} 
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
