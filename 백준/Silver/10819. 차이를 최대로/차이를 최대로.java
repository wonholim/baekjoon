

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int max;
	static int[] c;
	static boolean[] d;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = new int[n];
		d = new boolean[n];
		max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		BT("", 0);
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(String t, int depth) {
		// TODO Auto-generated method stub
		if(n == depth) {
			int all = 0;
			String[] tmp = t.split("");
			for(int k = 1; k < tmp.length; k++) {
				all += Math.abs(c[Integer.parseInt(tmp[k - 1])] - c[Integer.parseInt(tmp[k])]);
			}
			max = Math.max(all, max);
		}else {
			for(int i = 0; i < n; i++) {
				if(!d[i]) {
					d[i] = true;
					BT(t + "" + i, depth + 1);
					d[i] = false;
				}
			}
		}
	}

}
