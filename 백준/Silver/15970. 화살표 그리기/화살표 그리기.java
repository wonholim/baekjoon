

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] a;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		a = new ArrayList[t];
		for(int i = 0; i < t; i++) {
			a[i] = new ArrayList<>();
		}
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			int color = Integer.parseInt(st.nextToken()) - 1;
			a[color].add(tmp);
		}
		for(int i = 0; i < t; i++) { 
			Collections.sort(a[i]);
		}
		int sum = 0;
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < a[i].size(); j++) {
				int l = toLeft(i, j);
				int r = toRight(i, j);
				sum += Math.min(l, r);
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static int toLeft(int i, int j) {
		if(j == 0) return Integer.MAX_VALUE;
		return a[i].get(j) - a[i].get(j - 1);
	}
	public static int toRight(int i, int j) {
		if(j + 1 == a[i].size()) return Integer.MAX_VALUE;
		return a[i].get(j + 1) - a[i].get(j);
	}
}
