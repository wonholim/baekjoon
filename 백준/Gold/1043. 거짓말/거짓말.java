

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
	static int[] parent;
	static int n;
	static int m;
	static int[] tr;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		list = new ArrayList[m + 1];
		for (int i = 1; i < n + 1; i++) {
			parent[i] = i;
		}
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		tr = new int[t];
		for(int i = 0; i < t; i++) {
			tr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i < m + 1; i++) {
			st = new StringTokenizer(br.readLine());
			list[i] = new ArrayList<>();
			int k = Integer.parseInt(st.nextToken());
			for(int j = 0; j < k; j++) {
				list[i].add(Integer.parseInt(st.nextToken()));
			}
		}
		for(int i = 1; i < m + 1; i++) {
			for(int j = 1; j < list[i].size(); j++) {
				if(!find(list[i].get(0), list[i].get(j))) unionParent(list[i].get(0), list[i].get(j));
			}
		}
		int count = 0;
		for(int i = 1; i < m + 1; i++) {
			boolean check = false;
			int k = list[i].get(0);
			for(int j = 0; j < t; j++) {
				if(find(k, tr[j])) {
					check = true;
					break;
				}
			}
			if(!check) count++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void unionParent(int x, int y) {
		// TODO Auto-generated method stub
		x = getParent(x);
		y = getParent(y);
		if (x > y) parent[y] = x;
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
