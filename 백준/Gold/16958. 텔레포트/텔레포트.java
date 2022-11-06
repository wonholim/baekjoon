
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
// 기하학
public class Main {
	static int t;
	static int[][] total_nodes;
	static ArrayList<int[]> teleport_nodes;
	static int[] node_values;
	static int INF = 10000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		total_nodes = new int[n + 1][2];
		teleport_nodes = new ArrayList<>();
		node_values = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			total_nodes[i][0] = x;
			total_nodes[i][1] = y;
			if(s == 1) {
				teleport_nodes.add(new int[] {x, y});
			}
		}
		for(int i = 1; i < n + 1; i++) {
			int x1 = total_nodes[i][0];
			int y1 = total_nodes[i][1];
			int node_value = INF;
			for(int[] teleportable_point : teleport_nodes) {
				int x2 = teleportable_point[0];
				int y2 = teleportable_point[1];
				int distance = dist(x1, y1, x2, y2);
				if(distance < node_value) {
					node_value = distance;
				}
			}
			node_values[i] = node_value;
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int x1 = total_nodes[start][0];
			int y1 = total_nodes[start][1];
			int x2 = total_nodes[end][0];
			int y2 = total_nodes[end][1];
			sb.append(Math.min(dist(x1,  y1, x2, y2), node_values[start] + t + node_values[end]) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int dist(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}

}
