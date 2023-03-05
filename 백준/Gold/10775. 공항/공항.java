
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int g = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(br.readLine());
		parent = new int[g + 1];
		for(int i = 1; i < g + 1; i++) {
			parent[i] = i;
		}
		int cnt = 0;
 		for(int i = 1; i < p + 1; i++) {
			int air = Integer.parseInt(br.readLine());
			if(getParent(air) != 0) {
				unionParent(getParent(air), getParent(air) - 1);
				cnt++;
			}else break;
		}
 		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static void unionParent(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if(x != y) parent[x] = y;
		else parent[y] = x;
	}
	public static boolean find(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		return x == y ? true : false;
	}
	public static int getParent(int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent[x]);
	}
}
