import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] d;
	static boolean[] f;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		list = new ArrayList[a + 1];
		d = new boolean[a + 1];
		f = new boolean[a + 1];
		for(int i = 1; i <= a; i++) {
			list[i] = new ArrayList<>();
		}
		int b = Integer.parseInt(br.readLine());
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			list[e].add(g);
			list[g].add(e);
		}
		dfs(1, 0);
		int count = 0;
		for(int i = 2; i <= a; i++) {
			if(f[i]) count++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		if(j > 2) return;
		f[i] = true;
		for(int k : list[i]) {
			if(!d[k]) {
				d[k] = true;
				dfs(k, j + 1);
				d[k] = false;
			}
		}
	}

}
