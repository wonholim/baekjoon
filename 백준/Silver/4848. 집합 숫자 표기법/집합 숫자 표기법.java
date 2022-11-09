

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] a = new String[16];
		a[0] = "{}";
		a[1] = "{{}}";
		for(int i = 2; i < 16; i++) {
			a[i] = "{";
			for(int j = 0; j < i; j++) {
				a[i] += a[j];
				if(j != i - 1) {
					a[i] += ",";
				}
			}
			a[i] += "}";
		}
		int b = Integer.parseInt(br.readLine());
		while(b --> 0) {
			String k = br.readLine();
			String l = br.readLine();
			int sum = 0;
			for(int i = 0; i < 16; i++) {
				if(k.equals(a[i])) {
					sum += i;
				}
				if(l.equals(a[i])) {
					sum += i;
				}
			}
			sb.append(a[sum] + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
