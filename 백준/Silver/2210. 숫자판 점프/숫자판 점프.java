

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static class Number{
		int i, j, a;
		String n;
		public Number(int i, int j, int a, String n) {
			this.i = i;
			this.a = a;
			this.j = j;
			this.n = n;
		}
	}
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<Number> qu;
	static int[][] c;
	static Set<String> set;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		c = new int[5][5];
		qu = new ArrayDeque<>();
		set = new HashSet<>();
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				qu.offer(new Number(i, j, 0, Integer.toString(c[i][j])));
				while(!qu.isEmpty()) {
					Number s = qu.poll();
					if(s.a == 5) {
						set.add(s.n);
					}else {
						for(int k = 0; k < 4; k++) {
							int q = s.i + dx[k];
							int w = s.j + dy[k];
							if(q >= 0 && w >= 0 && q < 5 && w < 5) {
								qu.offer(new Number(q, w, s.a + 1,s.n + c[q][w]));
							}
						}
					}
				}
			}
		}
		sb.append(set.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
