

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static int[] parent;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		c = new char[n][m];
		parent = new int[(n * m) + 1];
		
		for(int i = 0; i < n * m; i++) parent[i] = i;
		
		for(int i = 0; i < n; i++) {c[i] = br.readLine().toCharArray();}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int pa = i * m + j; 
				int ch = 0;
				if(c[i][j] == 'U') {
					ch = ((i - 1) * m) + j;
				}else if(c[i][j] == 'D') {
					ch = ((i + 1) * m) + j;
				}else if(c[i][j] == 'L') {
					ch = (i * m) + (j - 1);
				}else {
					ch = (i * m) + (j + 1);
				}
				if(!find(pa, ch)) unionParent(pa, ch);
			}
		}
		Set<Integer> s = new HashSet<>();
		for(int i = 0; i < (n * m); i++) {
			s.add(getParent(i));
		}
		sb.append(s.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static int getParent(int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
	public static boolean find(int x, int y) {
		return getParent(x) == getParent(y) ? true : false;
	}
	public static void unionParent(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if(x > y) parent[x] = y;
		else parent[y] = x;
	}
}
