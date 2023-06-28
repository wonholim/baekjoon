
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	static boolean[] d;
	static ArrayDeque<int[]> q;
	static int n;
	static int k;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		d = new boolean[n + 1];
		d[0] = true;
		q = new ArrayDeque<>();
		q.offer(new int[] {0, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == n) {
				System.out.println("minigimbob");
				return;
			}
			if(g[1] == k) continue;
			if(g[0] + 1 <= n && !d[g[0] + 1]) {
				d[g[0] + 1] = true;
				q.offer(new int[] {g[0] + 1, g[1] + 1});
			}
			if(g[0] + (g[0] / 2) <= n && !d[g[0] + (g[0] / 2)]) {
				d[g[0] + (g[0] / 2)] = true;
				q.offer(new int[] {g[0] + (g[0] / 2), g[1] + 1});
			}
		}
		sb.append("water");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
