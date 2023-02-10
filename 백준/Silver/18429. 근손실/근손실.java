

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static boolean[] d;
	static int[] c;
	static StringBuilder sb;
	static int n;
	static int k;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		d = new boolean[n];
		c = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		BT(500, 0);
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(int s, int q) {
		// TODO Auto-generated method stub
		if(s < 500) return;
		if(q == n) {
			count++;
		}else {
			for(int i = 0; i < n; i++) {
				if(!d[i]) {
					d[i] = true;
					BT(s - k + c[i], q + 1);
					d[i] = false;
				}
			}
		}
	}
}
