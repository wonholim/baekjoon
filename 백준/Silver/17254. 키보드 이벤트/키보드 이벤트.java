

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Key implements Comparable<Key>{
		int n;
		int t;
		char c;
		public Key(int n, int t, char c) {
			this.n = n;
			this.t = t;
			this.c = c;
		}
		public int compareTo(Key o) {
			if(this.t == o.t) {
				return this.n - o.n;
			}
			return this.t - o.t;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		ArrayList<Key> list = new ArrayList<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			list.add(new Key(a, b, c));
		}
		Collections.sort(list);
		for(Key k : list) {
			sb.append(k.c);	
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
