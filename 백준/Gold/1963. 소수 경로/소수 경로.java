

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
	static boolean[] d;
	static boolean[] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		c = new boolean[10001];
		for(int i = 2; i < 10001; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j < 10001; j = i + j) {
				c[j] = true;
			}
		}
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String[] a = st.nextToken().split("");
			String[] b = st.nextToken().split("");
			q = new ArrayDeque<>();
			d = new boolean[10001];
			String tmpA = "";
			String tmpB = "";
			for(int i = 0; i < a.length; i++) {
				tmpA += a[i];
			}
			for(int i = 0; i < b.length; i++) {
				tmpB += b[i];
			}
			d[Integer.parseInt(tmpA)] = true;
 			q.offer(new int[] {Integer.parseInt(tmpA), 0});
			while(!q.isEmpty()) {
				int[] g = q.poll();
				if(g[0] == Integer.parseInt(tmpB)) {
					sb.append(g[1] + "\n");
					break;
				}
				for(int k = 0; k < 4; k++) {
					if(k == 0) {
						convert(k, g);
					}else if(k == 1) {
						convert(k, g);
					}else if(k == 2) {
						convert(k, g);
					}else {
						convert(k, g);
					}
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void convert(int k, int[] g) {
		// TODO Auto-generated method stub
		String[] a = Integer.toString(g[0]).split("");
		for(int i = 0; i < 10; i++) {
			String[] l = a;
			l[k] = Integer.toString(i);
			String tmpA = "";
			for(int j = 0; j < l.length; j++) {
				tmpA += l[j];
			}
			if(!c[Integer.parseInt(tmpA)] && Integer.parseInt(tmpA) > 1000) {
				if(!d[Integer.parseInt(tmpA)]) {
					d[Integer.parseInt(tmpA)] = true;
					q.offer(new int[] {Integer.parseInt(tmpA), g[1] + 1});
				}
			}
		}
	}

}
