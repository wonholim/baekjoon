

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static Set<String> s;
	static int n;
	static int k;
	static int count;
	static StringBuilder sb;
	static int[] c;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(br.readLine());
		c = new int[n];
		d = new boolean[n];
		s = new HashSet<>();
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		BT(0 ,"");
		sb.append(s.size());
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(int depth, String nk) {
		// TODO Auto-generated method stub
		if(depth == k) {
			s.add(nk);
		}else {
			for(int i = 0; i < n; i++) {
				if(!d[i]) {
					d[i] = true;
					BT(depth + 1, nk + c[i]);
					d[i] = false;
				}
			}
		}
	}

}
