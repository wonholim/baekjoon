

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
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			String[] k = br.readLine().split(" ");
			int[] c = new int[k.length];
			for(int i = 0; i < c.length; i++) {
				c[i] = Integer.parseInt(k[i]);
			}
			Arrays.sort(c);
			int max = 1;
			for(int i = 0; i < k.length; i++) {
				for(int j = i + 1; j < k.length; j++) {
					max = Math.max(max, gcd(c[i], c[j]));
				}
			}
			sb.append(max + "\n");
		}
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
