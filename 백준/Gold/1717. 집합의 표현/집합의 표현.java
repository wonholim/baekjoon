import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new int[a + 1];
		for(int i = 0; i <= a; i++) {
			c[i] = i;
		}
		for(int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			if(q == 1) {
				if(find(d) == find(e)) {
					sb.append("YES\n");
				}else {
					sb.append("NO\n");
				}
			}else {
				union(d, e);
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void union(int d, int e) {
		// TODO Auto-generated method stub
		d = find(d);
		e = find(e);
		if(d < e) {
			c[e] = d;
		}else {
			c[d] = e;
		}
	}

	private static int find(int d) {
		// TODO Auto-generated method stub
		if(d == c[d]) {
			return d;
		}else {
			return c[d] = find(c[d]);
		}
	}

}