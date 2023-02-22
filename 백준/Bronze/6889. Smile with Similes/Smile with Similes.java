

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
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String[] a = new String[n];
		String[] b = new String[m];
		for(int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}
		for(int i = 0; i < m; i++) {
			b[i] = br.readLine();
		}
		for(String k : a) {
			for(String k1 : b) {
				sb.append(k + " as " + k1 + "\n");
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
