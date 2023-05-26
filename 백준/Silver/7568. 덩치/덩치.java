
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[t];
		List<Node> list = new ArrayList<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Node(x, y));
		}
		for (int i = 0; i < list.size(); i++) {
			int cnt = 1;
			for(int j = 0; j < list.size(); j++) {
				if(i == j) continue;
				if(list.get(i).x < list.get(j).x && list.get(i).y < list.get(j).y) {
					cnt++;
				}
			}
			sb.append(cnt + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
