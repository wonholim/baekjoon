import java.io.*;
import java.util.*;

public class Main {
	//Vardy는 제 부계정이에요!
	static class Node implements Comparable<Node>{
		int t;
		String k;
		public Node(int t, String k) {
			this.t = t;
			this.k = k;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return o.k.compareTo(this.k);
		}
	}
	static ArrayList<Integer>[] list;
	static Queue<Integer> q;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		list = new ArrayList[n];
		d = new boolean[n];
		q = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		String[] line = br.readLine().split("");
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken()) - 1;
			int k = Integer.parseInt(st.nextToken()) - 1;
			list[j].add(k);
			list[k].add(j);
		}
		d[0] = true;
		q.offer(0);
		ArrayList<Node> ans = new ArrayList<>();
		sb.append(line[0]);
		while(!q.isEmpty()) {
			int k = q.size();
			while(k --> 0) {
				int cur = q.poll();
				for(int next : list[cur]) {
					if(!d[next]) {
						d[next] = true;
						ans.add(new Node(next, line[next]));
					}
				}
			}
			if(!ans.isEmpty()) {
				Collections.sort(ans);
				Node cur = ans.get(0);
				q.offer(cur.t);
				sb.append(cur.k);
				for(int i = 1; i < ans.size(); i++) 
					if(cur.k.equals(ans.get(i).k)) {
						q.offer(ans.get(i).t);
					}
				}
				ans.clear();
			}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
