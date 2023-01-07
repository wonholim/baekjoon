

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		if(x > (n * 26) || n > x) {
			System.out.println("!");
			return;
		}
		int k = n;
		char[] c = new char[k];
		for(int i = 0; i < k; i++) {
			c[i] = 'A';
			x--;
		}
		while(x > 25) {
			c[k - 1] += 25;
			x -= 25;
			k--;
		}
		if(x > 0) {
			c[k - 1] += x;
		}
		for(int i = 0; i < n; i++) {
			sb.append(c[i]);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
