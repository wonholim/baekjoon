

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int count = 0;
	static int r;
	static int c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		z(0, 0, (int)Math.pow(2, n));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void z(int i, int j, int n) {
		// TODO Auto-generated method stub
		if(i == r && j == c) {
			System.out.println(count);
			return;
		}
		if(r - i < n && c - j < n && r - i >= 0 && c - j >= 0) {
			int k = n / 2;
			z(i, j, k);
			z(i, j + k, k);
			z(i + k, j, k);
			z(i + k, j + k, k);
		}else {
			count += (int)Math.pow(n, 2);
		}
	}
}
