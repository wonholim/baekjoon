import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;
	static ArrayList<Integer>[] link;
	static int[] se;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		link = new ArrayList[b + 1];
		check = new boolean[b + 1];
		se = new int[b + 1];
		for(int i = 1; i <= b; i++) {
			link[i] = new ArrayList<>();
		}
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			link[d].add(e);
			link[e].add(d);
		}
		for(int i = 1; i <= b; i++) {
			Collections.sort(link[i]);
		}
		dfs(g, 0);
		for(int i = 1; i <= b; i++) {
			if(check[i]) {
				sb.append(se[i] +"\n");
			}else {
				sb.append(-1 +"\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int d) {
		// TODO Auto-generated method stub
		if(check[i]) return;
		check[i] = true;
		se[i] = d;
		for(int k : link[i]) {
			if(check[k] == false) {
				dfs(k, d + 1);
			}
		}
	}

}