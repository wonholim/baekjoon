

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(c);
		for(int i = 0; i < n; i++) {
			int q = n - i;
			if(c[i] >= q) {
				System.out.println(q);
				return;
			}
		}
		sb.append(0);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
