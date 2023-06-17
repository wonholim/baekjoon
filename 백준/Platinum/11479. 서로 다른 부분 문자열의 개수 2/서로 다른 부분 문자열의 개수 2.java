
import java.io.*;
import java.util.*;

public class Main {
	static Integer[] g = new Integer[100_000_1];
	static Integer[] tg = new Integer[100_000_1];
	static Integer[] sa = new Integer[100_000_1];
	static Integer[] lcp = new Integer[100_000_1];
	static Integer[] r = new Integer[100_000_1];
	static int t = 1;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] c = br.readLine().toCharArray();
		n = c.length;
		for(int i = 0; i < n; i++) {
			sa[i] = i;
			g[i] = c[i] - 'a';
		}
		
		while(t <= n) {
			g[n] = -1;
			Arrays.sort(sa, 0, n, (x, y) -> {
			    if (g[x] == g[y]) {
			        return Integer.compare(g[x + t], g[y + t]);
			    }
			    return Integer.compare(g[x], g[y]);
			});
			tg[sa[0]] = 0;
			for(int i = 1; i < n; i++) {
				if(cmp(sa[i - 1], sa[i])) tg[sa[i]] = tg[sa[i - 1]] + 1;
				else tg[sa[i]] = tg[sa[i - 1]];
			}
			for(int i = 0; i < n; i++) g[i] = tg[i];
			t <<= 1;
		}
		
		for(int i = 0; i < n; i++) {
			r[sa[i]] = i;
		}
		int l = 0;
		for(int i = 0; i < n; i++) {
			int k = r[i];
			if(k != 0) {
				int j = sa[k - 1];
				while(len(j + l, i +  l) && c[j + l] == c[i + l]) {
					l++;
				}
				lcp[k] = l;
				if(l != 0) l--;
			}
		}
		lcp[0] = 0;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum += n - sa[i] - lcp[i];
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean len(int i, int j) {
		// TODO Auto-generated method stub
		return i < n && j < n ? true : false;
	}
	private static boolean cmp(int x, int y) {
		// TODO Auto-generated method stub
		if(g[x] == g[y]) return g[x + t] < g[y + t];
		return g[x] < g[y];
	}
}
