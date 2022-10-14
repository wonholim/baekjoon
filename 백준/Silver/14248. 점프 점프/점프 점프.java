
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<Integer> q;
	static int[] c;
	static boolean[] d;
	static int a;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		a = Integer.parseInt(br.readLine());
		q = new ArrayDeque<>();
		c = new int[a + 1];
		d = new boolean[a + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int start = Integer.parseInt(br.readLine());
		d[start] = true;
		q.offer(start);
		while(!q.isEmpty()) {
			int g = q.poll();
			int i = g + c[g] * 1;
			int j = g + c[g] * -1;
			if(i >= 1 && i <= a && !d[i]) {
				d[i] = true;
				q.offer(i);
			}
			if(j >= 1 && j <= a && !d[j]) {
				d[j] = true;
				q.offer(j);
			}
		}
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(d[i]) count++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
