

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		d = new int[a + 1];
		for(int i = 1; i <= a; i++) {
			d[i] = i;
		}
		for(int i = 0; i < a - 2; i++) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			union(b, c);
		}
		for(int i = 2; i <= a; i++) {
			if(!getFind(1, i)) {
				sb.append(1 + " " + i);
				break;
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean getFind(int a, int b) {
		// TODO Auto-generated method stub
		a = find(a);
		b = find(b);
		return a == b ? true : false;
	}

	private static void union(int b, int c) {
		// TODO Auto-generated method stub
		b = find(b);
		c = find(c);
		if(b != c) {
			if(b < c) d[c] = b;
			else d[b] = c;
		}
	}

	private static int find(int b) {
		// TODO Auto-generated method stub
		if(d[b] == b) return b;
		else return d[b] = find(d[b]);
	}

}
