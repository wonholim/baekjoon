

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] sorted;
	static int[] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			c = new int[k];
			sorted = new int[k];
			for(int i = 0; i < k; i++) {
				c[i] = Integer.parseInt(st.nextToken());
				sorted[i] = c[i];
			}
			Arrays.sort(sorted);
			int count = 0;
			while(true) {
				if(isSort()) break;
				for(int i = 1; i < k; i++) {
					if(c[i - 1] > c[i]) {
						int tmp = c[i - 1];
						c[i - 1] = c[i];
						c[i] = tmp;
						count++;
					}
				}
			}
			sb.append(count+ "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean isSort() {
		// TODO Auto-generated method stub
		for(int i = 0; i < c.length; i++) {
			if(c[i] != sorted[i]) return false;
		}
		return true;
	}

}
