

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[t];
		int[] d = new int[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		d[t - 1] = c[t - 1];
		int max = d[t - 1];
		for(int i = t - 1; i >= 0; i--) {
			if(c[i] > max) {
				max = c[i];
			}
			d[i] = max;
		}
		int mx = 0;
		for(int i = 0; i < t; i++) {
			mx = Math.max(mx, d[i] - c[i]);
		}
		sb.append(mx);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
