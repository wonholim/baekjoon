
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] c;
	static boolean[] d;
	static int a;
	static int b;
	static int gg;
	static Queue<int[]> q;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		gg = Integer.parseInt(st.nextToken());
		c = new int[a + 1];
		d = new boolean[a + 1];
		q = new ArrayDeque<>();
		c[b] = 0;
		d[b] = true;
		q.offer(new int[] { b, c[b] });
		int uu = Integer.parseInt(st.nextToken());
		int dd = Integer.parseInt(st.nextToken());
		while (!q.isEmpty()) {
			int[] g = q.poll();
			int i = g[0] + uu;
			int j = g[0] - dd;
			if (i > 0 && i <= a) {
				if (!d[i]) {
					d[i] = true;
					c[i] = g[1] + 1;
					q.offer(new int[] { i, g[1] + 1 });
				}
			}
			if (j > 0 && j <= a) {
				if (!d[j]) {
					d[j] = true;
					c[j] = g[1] + 1;
					q.offer(new int[] { j, g[1] + 1 });
				}
			}
		}
		if (d[gg]) {
			sb.append(c[gg]);
		} else {
			sb.append("use the stairs");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
