import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;
	static ArrayList<Integer>[] link;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		link = new ArrayList[b + 1];
		check = new boolean[b + 1];
		int count = 0;
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
			if(!check[i]) {
				count++;
				dfs(i);
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i) {
		// TODO Auto-generated method stub
		if(check[i]) return;
		check[i] = true;
		for(int k : link[i]) {
			if(check[k] == false) {
				dfs(k);
			}
		}
	}

}
