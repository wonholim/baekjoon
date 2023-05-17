
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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int find = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] list = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
		}
		int[] t = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(st.nextToken());
		}
		int vertex = -1;
		for(int i = 0; i < n; i++) {
			if(find == t[i]) {
				vertex = i;
			}
		}
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {0, 0});
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(g[0] == vertex) {
				sb.append(g[1]);
				break;
			}
			for(int k : list[g[0]]) {
				q.offer(new int[] {k, g[1] + 1});
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
