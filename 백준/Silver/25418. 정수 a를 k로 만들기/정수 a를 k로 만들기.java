import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 2};
	static Queue<int[]> q;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		q = new ArrayDeque<>();
		d = new boolean[b + 1];
		d[a] = true;
		q.offer(new int[] {a, 0});
		int min = 0;
		while(!q.isEmpty()) {
			int[] w = q.poll();
			if(w[0] == b) {
				min = w[1];
				break;
			}
			int i = w[0] + dx[0];
			if(i <= b && !d[i]) {
				d[i] = true;
				q.offer(new int[] {i, w[1] + 1});
			}
			int j = w[0] * dx[1];
			if(j <= b && !d[j]) {
				d[j] = true;
				q.offer(new int[] {j, w[1] + 1});
			}
		}
		sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}