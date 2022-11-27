

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
	static int n;
	static char[] c;
	static int min;
	static boolean[] v;
	static StringBuilder sb;
	static int t;
	static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		c = new char[t + 1];
		v = new boolean[t + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= t; i++) {
			c[i] = st.nextToken().charAt(0);
		}
		Arrays.sort(c);
		recursive(1, 0);
//		Collections.sort(list);
		for(String g : list) {
			sb.append(g + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k, int count) {
		// TODO Auto-generated method stub
		if(count == n) {
			String tmp = "";
			int jaum = 0;
			int moum = 0;
			for(int i = 1; i <= t; i++) {
				if(v[i]) {
					if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
						jaum++;
					}else {
						moum++;
					}
					tmp += c[i];
				}
			}
			if(jaum >= 1 && moum >= 2) list.add(tmp);
		}else {
			for(int i = k; i <= t; i++) {
				if(!v[i]) {
					v[i] = true;
					recursive(i + 1, count + 1);
					v[i] = false;
				}
			}
		}
	}
}
