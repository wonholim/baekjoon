

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] c;
	static boolean[] v;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		c = new int[m];
		v = new boolean[n];
		backTracking(m, n, 0);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void backTracking(int m, int n, int i) {
		// TODO Auto-generated method stub
		if(m == i) {
			for(int j = 0; j < m; j++) {
				sb.append(c[j] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int k = 0; k < n; k++) {
			if(!v[k]) {
				v[k] = true;
				c[i] = k + 1;
				backTracking(m, n, i + 1);
				v[k] = false;
			}
		}
	}

}
