

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] c = new int[n + 1];
		int[] cnt = new int[100001];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int r = 0;
		for(int l = 1; l <= n; l++) {
			
			while(r + 1 <= n && cnt[c[r + 1]] != k) {
				cnt[c[r + 1]]++;
				r++;
			}
			cnt[c[l]]--;
			max = Math.max(max, r - l + 1);
		}
		sb.append(max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
