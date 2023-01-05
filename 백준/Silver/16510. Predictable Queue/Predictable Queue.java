

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		int[] prefix = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		prefix[0] = c[0];
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + c[i];
		}
		while(t --> 0) {
			int check = Integer.parseInt(br.readLine());
			int l = 0;
			int r = n;
			int max = 0;
			while(l < r) {
				int mid = (l + r) / 2;
				if(prefix[mid] > check) {
					r = mid;
				}else if(prefix[mid] <= check) {
					l = mid + 1;
				}
			}
			sb.append((l) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
