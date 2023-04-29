
import java.io.*;
import java.util.*;

public class Main {
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int n;
	static int m;
	static char[][] c;
	static boolean[][] d;
	static Queue<Node> q;
	static List<Node> list;
	static Map<Character, Integer> map;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int count = 0;
	static int all = 0;
	static int door = 0;
	static int check = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			c = new char[n][m];
			d = new boolean[n][m];
			q = new ArrayDeque<>();
			list = new ArrayList<>();
			map = new HashMap<>();
			count = 0;
			all = 0;
			door = 0;
			check = 0;
			for(int i = 0; i < n; i++) {
				c[i] = br.readLine().toCharArray();
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(c[i][j] == '$') all++;
					if(c[i][j] >= 'A' && c[i][j] <= 'Z') door++;
				}
			}
			for(char k : br.readLine().toCharArray()) {
				if(k == '0') break;
				map.put(Character.toUpperCase(k), 1);
			}
			// edge start
			for(int i = 0; i < n; i++) {
				if(c[i][0] == '.') {q.offer(new Node(i, 0)); d[i][0] = true;}
				else if(c[i][0] >= 'a' && c[i][0] <= 'z') {q.offer(new Node(i, 0)); d[i][0] = true; map.put(Character.toUpperCase(c[i][0]), 1);}
				else if(c[i][0] >= 'A' && c[i][0] <= 'Z') {list.add(new Node(i, 0));}
				else if(c[i][0] == '$') {q.offer(new Node(i, 0)); d[i][0] = true; count++;}
				
				if(c[i][m - 1] == '.') {q.offer(new Node(i, m - 1)); d[i][m - 1] = true;}
				else if(c[i][m - 1] >= 'a' && c[i][m - 1] <= 'z') {q.offer(new Node(i, m - 1)); d[i][m - 1] = true; map.put(Character.toUpperCase(c[i][m - 1]), 1);}
				else if(c[i][m - 1] >= 'A' && c[i][m - 1] <= 'Z') {list.add(new Node(i, m - 1));}
				else if(c[i][m - 1] == '$') {q.offer(new Node(i, m - 1)); d[i][m - 1] = true; count++;}
			}
			for(int i = 1; i < m - 1; i++) {
				if(c[0][i] == '.') {q.offer(new Node(0, i)); d[0][i] = true;}
				else if(c[0][i] >= 'a' && c[0][i] <= 'z') {q.offer(new Node(0, i)); d[0][i] = true; map.put(Character.toUpperCase(c[0][i]), 1);}
				else if(c[0][i] >= 'A' && c[0][i] <= 'Z') {list.add(new Node(0, i));}
				else if(c[0][i] == '$') {q.offer(new Node(0, i)); d[0][i] = true; count++;}
				
				if(c[n - 1][i] == '.') {q.offer(new Node(n - 1, i)); d[n - 1][i] = true;}
				else if(c[n - 1][i] >= 'a' && c[n - 1][i] <= 'z') {q.offer(new Node(n - 1, i)); d[n - 1][i] = true; map.put(Character.toUpperCase(c[n - 1][i]), 1);}
				else if(c[n - 1][i] >= 'A' && c[n - 1][i] <= 'Z') {list.add(new Node(n - 1, i));}
				else if(c[n - 1][i] == '$') {q.offer(new Node(n - 1, i)); d[n - 1][i] = true; count++;}
				
			}
			for(Node tmpp : list) {
				if(map.get(c[tmpp.x][tmpp.y]) != null) {
					d[tmpp.x][tmpp.y] = true;
					q.offer(new Node(tmpp.x, tmpp.y));
				}
			}
			while(!q.isEmpty()) {
				Node cur = q.poll();
				for(int k = 0; k < 4; k++) {
					int i = cur.x + dx[k];
					int j = cur.y + dy[k];
					if(i >= 0 && j >= 0 && i < n && j < m) {
						if(c[i][j] != '*' && !d[i][j]) {
							if(c[i][j] >= 'A' && c[i][j] <= 'Z') {
								if(map.get(c[i][j]) != null) {
									c[i][j] = '.';
									d[i][j] = true;
									q.offer(new Node(i, j));
								}else {
									list.add(new Node(i, j));
								}
							}else if(c[i][j] == '$') {
								count++;
								d[i][j] = true;
								q.offer(new Node(i, j));
							}else if(c[i][j] >= 'a' && c[i][j] <= 'z') {
								d[i][j] = true;
								map.put(Character.toUpperCase(c[i][j]), 1);
								q.offer(new Node(i, j));
								
								for(Node tmpp : list) {
									if(map.get(c[tmpp.x][tmpp.y]) != null) {
										d[tmpp.x][tmpp.y] = true;
										q.offer(new Node(tmpp.x, tmpp.y));
									}
								}
							}else if(c[i][j] == '.'){
								d[i][j] = true;
								q.offer(new Node(i, j));
							}
						}
					}
				}
			}
			sb.append(count + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
