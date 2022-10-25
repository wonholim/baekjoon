

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] a;
		int b = Integer.parseInt(br.readLine());
		while(b --> 0) {
			a = new int[10];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 10; i++) {
				a[i] = Integer.parseInt(st.nextToken());
				
			}
			Arrays.sort(a);
			sb.append(a[7] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
