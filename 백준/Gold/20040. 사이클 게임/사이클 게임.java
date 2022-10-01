import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
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
		c = new int[a];
		for(int i = 0; i < a; i++) {
			c[i] = i;
		}
		int count = 0;
		for(int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			if(find(d) == find(e)) {
				count = i + 1;
				break;
			}else {
				union(d, e);
			}
		}
		sb.append(count);
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
