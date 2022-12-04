

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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] s = new int[n + m];
		int[] t = new int[n + m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n + m; j++) {
				int k = Integer.parseInt(st.nextToken());
				t[j] += k;
				s[i] = s[i] - k;
			}
		}
		for(int i = 0; i < n + m; i++) {
			sb.append(s[i] + t[i] + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
