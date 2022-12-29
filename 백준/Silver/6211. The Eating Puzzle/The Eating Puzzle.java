

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int max;
	static int t;
	static int[] c;
	static int min;
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		max = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		c = new int[t];
		d = new boolean[t];
		min = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < t; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < (1 << t); i++) {
			int sum = 0;
			for(int j = 0; j < t; j++) {
				if((i & (1 << j)) != 0) sum += c[j];
			}
			if(max < sum) continue;
			min = Math.max(min, sum);
		}
		sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void bT(int t2, int i) {
		// TODO Auto-generated method stub
		if(i <= max) {
			min = Math.max(min, i);
		} 
		for(int j = 0; j < t2; j++) {
			if(!d[j]) {
				d[j] = true;
				bT(t2, i + c[j]);
				d[j] = false;
			}
		}
	}

}
