

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
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int k = gcd(a, b);
		int max = 0;
		int index = 0;
		for(int i = 1; i <= k; i++) {
			if(k % i == 0) {
				int tmp = 0;
				for(char c : Integer.toString(i).toCharArray()) {
					tmp += (c - '0');
				}
				if(max < tmp) {
					max = tmp;
					index = i;
				}
			}
		}
		sb.append(index);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) return a;
		return gcd(b, a % b);
	}

}
