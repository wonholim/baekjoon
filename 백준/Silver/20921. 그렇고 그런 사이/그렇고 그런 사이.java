

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			c[i] = i + 1;
		}
		while(t --> 0) {
			for(int i = n - 1; i > 0; i--) {
				if(c[i] > c[i - 1]) {
					int tmp = c[i - 1];
					c[i - 1] = c[i];
					c[i] = tmp;
					break;
				}
			}
		}
		for(int k : c) sb.append(k + " ");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
