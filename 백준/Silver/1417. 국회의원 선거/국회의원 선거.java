

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	static int[] c;
	static int n;
	static int k;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		if(n == 1) {
			System.out.println(0);
			return;
		}
		c = new int[n - 1];
		k = Integer.parseInt(br.readLine());
		for(int i = 0; i < n - 1; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;
		while(true) {
			int i = max();
			if(check()) break;
			count++;
			c[i]--;
			k++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean check() {
		// TODO Auto-generated method stub
		for(int i = 0; i < n - 1; i++) {
			if(c[i] >= k) return false;
		}
		return true;
	}

	private static int max() {
		// TODO Auto-generated method stub
		int max = 0;
		int index = 0;
		for(int i = 0; i < n - 1; i++) {
			if(c[i] > max) { max = c[i]; index = i; }
		}
		return index;
	}

}
