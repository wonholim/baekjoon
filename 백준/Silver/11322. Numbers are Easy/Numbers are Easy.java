

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int b;
	static Queue<Long> q;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			b = Integer.parseInt(br.readLine());
			q = new ArrayDeque<>();
			q.offer((long) 1);
			while(!q.isEmpty()) {
				long g = q.poll();
				if(g % b == 0) {
					sb.append(g + "\n");
					break;
				}
				long i = (g * 10);
				q.offer(i);
				long j = (g * 10) + 1;
				q.offer(j);
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
