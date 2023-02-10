

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static boolean[] d;
	static StringBuilder sb;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		d = new boolean[n + 1];
		BT("", 0);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(String s, int q) {
		// TODO Auto-generated method stub
		if(q == n) {
			sb.append(s + "\n");
		}else {
			for(int i = 1; i <= n; i++) {
				if(!d[i]) {
					d[i] = true;
					BT(s + i + " ", q + 1);
					d[i] = false;
				}
			}
		}
	}
}
