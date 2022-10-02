import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] list;
	static int a;
	static int[] c;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		a = Integer.parseInt(br.readLine());
		list = new ArrayList[a + 1];
		c = new int[a + 1];
		d = new boolean[a + 1];
		for(int i = 1; i <= a; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 1; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			list[e].add(g);
			list[g].add(e);
		}
		dfs(1);
		for(int i = 2; i <= a; i++) {
			sb.append(c[i] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i) {
		// TODO Auto-generated method stub
		d[i] = true;
		for(int g : list[i]) {
			if(!d[g]) {
				c[g] = i;
				dfs(g);
			}
		}
	}

}