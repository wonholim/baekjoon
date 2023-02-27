

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	/*
	 * 
	 * 제한시간 : 0.25초 | 메모리 512MB
	 * ----------------------------
	 * N 0 ~ 500_000, K 0 ~ 500_000
	 * ----------------------------
	 * 수빈이 걷거나 순간이동이 가능하다.
	 * 걸을 경우 x -> x - 1 | x + 1
	 * 텔레포트 할 경우 -> 2 * x
	 * ----------------------------
	 * 동생은 이동할 때 마다 가속이 붙는다.
	 * 이전 거리에 +1 더한 거리를 이용한다.
	 * 1초 K + 1, 2초 K + 1 + 2, 3초 K + 1 + 2 + 3
	 * 동생은 즉 K + (t * (t + 1)) / 2 위치에 존재하게 된다.
	 * ----------------------------
	 * BFS로 문제해결이 가능해 보인다.
	 * 다만 시간이 0.25초라 각 경우의 수에서 규칙을 찾아야 하는 것으로 보임.
	 * ----------------------------
	 * 짝수와 홀수를 나누어 결과 값을 도출해 줘야한다.
	 * 2차원 배열을 생성해서 ...
	 * 짝수에 도달하는 경우 -> 다음번은 홀수 홀수 짝수가 되며
	 * 홀수에 도달하는 경우 -> 다음번은 짝수 짝수 짝수가 된다.
	 * 즉 수열의 합으로 계산하는 것으로 최적화를 하여도..
	 * 모든 경우의 수를 큐에 넣게 되면 0.25초를 벗어나게 되므로..
	 * 2차원 방문 배열을 이용해큐에 들어가는 연산을 피해야만 한다.
	 * 
	 * 문제푸는데 대략 2달 걸린거 같다.
	 */
	static Queue<int[]> q;
	static int[] c;
	static boolean[][] d;
	static int n;
	static int k;
	static int MAX = 500_001;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		q = new ArrayDeque<>();
		c = new int[MAX];
		d = new boolean[MAX][2];
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		q.offer(new int[] {n, 0});
		sb.append(SearchForBrother());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int SearchForBrother() {
		// TODO Auto-generated method stub
		d[n][0] = true;
		while(!q.isEmpty()) {
			int[] g = q.poll();
			if(k + (g[1] * (g[1] + 1) / 2) > MAX - 1) return -1;
			if(d[k + (g[1] * (g[1] + 1) / 2)][g[1] % 2]) return g[1];
			int b = g[0] - 1;
			int f = g[0] + 1;
			int db = g[0] * 2;
			if(db >= 0 && db < MAX && !d[db][(g[1] + 1) % 2]) {
				d[db][(g[1] + 1) % 2] = true;
				q.offer(new int[] {db, g[1] + 1});
			}
			if(b >= 0 && b < MAX && !d[b][(g[1] + 1) % 2]) {
				d[b][(g[1] + 1) % 2]= true;
				q.offer(new int[] {b, g[1] + 1});
			}
			if(f >= 0 && f < MAX && !d[f][(g[1] + 1) % 2]) {
				d[f][(g[1] + 1) % 2] = true;
				q.offer(new int[] {f, g[1] + 1});
			}
		}
		return -1;
	}

}
