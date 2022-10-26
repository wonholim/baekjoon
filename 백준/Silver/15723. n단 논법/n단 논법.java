

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] v;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int g = a;
		list = new ArrayList[51];
		for(int i = 1; i <= 50; i++) {
			list[i] = new ArrayList<>();
		}
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int b = st.nextToken().charAt(0) - '`';
			st.nextToken();
			int c = st.nextToken().charAt(0) - '`';
			list[b].add(c);
		}
		int d = Integer.parseInt(br.readLine());
		while(d --> 0) {
			st = new StringTokenizer(br.readLine());
			v = new boolean[50];
			int b = st.nextToken().charAt(0) - '`';
			st.nextToken();
			int c = st.nextToken().charAt(0) - '`';
			check(b);
			if(v[c]) {
				sb.append("T\n");
			}else {
				sb.append("F\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void check(int b) {
		// TODO Auto-generated method stub
		v[b] = true;
		for(int k : list[b]) {
			if(!v[k]) {
				check(k);
			}
		}
	}


}
