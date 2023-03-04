

import java.io.*;
import java.util.*;

public class Main {
	static int[] parent;
	static int n;
	static int m;
	static Map<String, Integer> m1;
	static Map<Integer, String> m2;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		m1 = new HashMap<>();
		m2 = new HashMap<>();
		parent = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		for(int i = 1; i < n + 1; i++) {
			String line = br.readLine();
			m1.put(line, i);
			m2.put(i, line);
		}
		for(int i = 1; i < m + 1; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			String x = st.nextToken();
			String y = st.nextToken();
			int w = Integer.parseInt(st.nextToken());
			if(w == 1) {
				if(getParent(m1.get(x)) == m1.get(y)) {
					parent[m1.get(x)] = m1.get(x);
					for(int j = 1; j < n + 1; j++) {
						if(getParent(j) == m1.get(y)) {
							unionParent(m1.get(x), j);
						}
					}
				}else {
					unionParent(m1.get(x), m1.get(y));
				}
			}else {
				if(getParent(m1.get(y)) == m1.get(x)) {
					parent[m1.get(y)] = m1.get(y);
					for(int j = 1; j < n + 1; j++) {
						if(getParent(j) == m1.get(x)) {
							unionParent(m1.get(y), j);
						}
					}
				}else {
					unionParent(m1.get(y), m1.get(x));
				}
			}
		}
		TreeSet<String> ts = new TreeSet<>();
		for(int i = 1; i < n + 1; i++) {
			ts.add(m2.get(getParent(i)));
		}
		sb.append(ts.size() + "\n");
		for(String k : ts) {sb.append(k + "\n");}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void union(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if(x != y) parent[y] = x;
		else parent[x] = y;
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if(x != y) parent[y] = x;
		else parent[x] = y;
	}

	private static boolean find(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}

	private static int getParent(int x) {
		// TODO Auto-generated method stub
		if (parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}

}
