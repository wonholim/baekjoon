
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] d;
	static boolean check;
	static int[] c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list = new ArrayList[a + 1];
			d = new boolean[a + 1];
			c = new int[a + 1];
			check = true;
			for(int i = 1; i <= a; i++) {
				list[i] = new ArrayList<>();
			}
			while(b --> 0) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				list[c].add(d);
				list[d].add(c);
			}
			for(int i = 1; i <= a; i++) {
				if(check) {
					dfs(i);
				}else {
					break;
				}
			}
			if(check) sb.append("YES\n");
			else sb.append("NO\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int i) {
		// TODO Auto-generated method stub
		d[i] = true;
		for(int k : list[i]) {
			if(!d[k]) {
				c[k] = (c[i] + 1) % 2;
				dfs(k);
			}else if(c[i] == c[k]) {
				check = false;
			}
		}
	}

}
