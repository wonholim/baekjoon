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
	static int q;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		a = Integer.parseInt(br.readLine());
		list = new ArrayList[a];
		c = new int[a];
		d = new boolean[a];
		count = 0;
		q = 0;
		for(int i = 0; i < a; i++) {
			list[i] = new ArrayList<>();
		}
		int head = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			int e = Integer.parseInt(st.nextToken());
			if(e == -1) {head = i; continue;}
			list[i].add(e);
			list[e].add(i);
		}
		q = Integer.parseInt(br.readLine());
		if(head == q) {
			sb.append(0);
		}else {
			dfs(head);
			sb.append(count);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i) {
		// TODO Auto-generated method stub
		d[i] = true;
		int tail = 0;
		for(int g : list[i]) {
			if(!d[g] && g != q) {
				tail++;
				dfs(g);
			}
		}
		if(tail == 0) {
			count++;
		}
	}
}
