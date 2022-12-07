

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
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] belt = new int[n * 2 + 1];
		int[] cnt = new int[d + 1];
		for(int i = 1; i <= n; i++) {
			belt[i] = Integer.parseInt(br.readLine());
			belt[n + i] = belt[i];
		}
		int max = 0;
		int tmp = 0;
		for(int i = 1; i <= k; i++) {
			cnt[belt[i]]++;
			if(cnt[belt[i]] == 1) {
				tmp++;
				max++;
			}
		}
		int l = 1;
		for(int i = k + 1; i <= n * 2; i++) {
			cnt[belt[l]]--;
			if(cnt[belt[l]] == 0) tmp--;
			cnt[belt[i]]++;
			if(cnt[belt[i]] == 1) tmp++;
			l++;
			
			if(cnt[c] == 0) max = Math.max(max, tmp + 1);
			else max = Math.max(max, tmp);
		}
		sb.append(max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
