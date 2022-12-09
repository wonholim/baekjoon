

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] list;
	static boolean[] d;
	static boolean check = false;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		list = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		d = new boolean[n];
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
			list[y].add(x);
		}
		for(int i = 0; i < n; i++) {
			d[i] = true;
			dfs(i, 0);
			d[i] = false;
			if(check) break;
		}
		if(check) sb.append(1);
		else sb.append(0);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int depth) {
		// TODO Auto-generated method stub
		if(depth == 4) {
			check = true;
			return;
		}
		for(int k : list[i]) {
			if(!d[k]) {
				d[k] = true;
				dfs(k, depth + 1);
				d[k] = false;
			}
		}
	}

}
