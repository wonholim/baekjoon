
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static int[] domodazzi;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		while(n --> 0) {
			int count = 1;
			Map<String, Integer> m = new HashMap<>();
			int t = Integer.parseInt(br.readLine());
			parent = new int[(2 * t) + 1];
			domodazzi = new int[(2 * t) + 1];
			for(int i = 1; i < (2 * t) + 1; i++) {
				parent[i] = i;
			}
			while(t --> 0) {
				st = new StringTokenizer(br.readLine());
				String l = st.nextToken();
				String r = st.nextToken();
				if(m.get(l) == null) {
					m.put(l, count);
					domodazzi[count++] = 1;
				}
				if(m.get(r) == null) {
					m.put(r, count);
					domodazzi[count++] = 1;
				}
				int f1 = m.get(l);
				int f2 = m.get(r);
				if(!find(f1, f2)) {
					unionParent(f1, f2);
				}
				sb.append(domodazzi[getParent(f1)]).append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void unionParent(int f1, int f2) {
		// TODO Auto-generated method stub
		int a = getParent(f1);
		int b = getParent(f2);
		if(a > b) {
			parent[a] = b;
			domodazzi[b] += domodazzi[a];
		}else {
			parent[b] = a;
			domodazzi[a] += domodazzi[b];
		}
	}
	private static boolean find(int f1, int f2) {
		// TODO Auto-generated method stub
		return getParent(f1) == getParent(f2) ? true : false;
	}
	private static int getParent(int f1) {
		// TODO Auto-generated method stub
		if(parent[f1] == f1) return f1;
		return getParent(parent[f1]);
	}

}
