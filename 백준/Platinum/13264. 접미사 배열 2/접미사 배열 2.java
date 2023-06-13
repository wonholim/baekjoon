
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static int MAX = 500_000;
	static Integer[] g;
	static Integer[] tg;
	static Integer[] sa;
	static int t;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] c = br.readLine().toCharArray();
		g = new Integer[MAX];
		tg = new Integer[MAX];
		sa = new Integer[MAX];
		t = 1;
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
		for(int i = 0; i < n; i++) sb.append(sa[i]).append('\n');
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean cmp(int x, int y) {
		if(g[x] == g[y]) return g[x + t] < g[y + t];
		return g[x] < g[y];
	}
}
