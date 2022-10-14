
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<long[]> q;
	static boolean[] d;
	static long a;
	static long b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		d = new boolean[(int) (b + 1)];
		q = new ArrayDeque<>();
		d[(int) a] = true;
		q.offer(new long[] {a, 0});
		boolean check = false;
		while(!q.isEmpty()) {
			long[] g = q.poll();
			if(g[0] == b) {
				sb.append(g[1] + 1);
				check = true;
				break;
			}
			long i = g[0] * 2;
			long j = Long.parseLong(Long.toString(g[0]) + "1");
			if(i >= a && i <= b && !d[(int) i]) {
				d[(int) i] = true;
				q.offer(new long[] {i, g[1] + 1});
			}
			if(j >= a && j <= b && !d[(int) j]) {
				d[(int) j] = true;
				q.offer(new long[] {j, g[1] + 1});
			}
		}
		if(!check) sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
