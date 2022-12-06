

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String g = br.readLine();
		int l = 0;
		int max = 0;
		int[] cnt = new int[27];
		for(int r = 0; r < g.length(); r++) {
			cnt[g.charAt(r) - 'a']++;
			while(true) {
				int tmp = 0;
				for(int i = 0; i < 26; i++) {
					if(cnt[i] != 0) tmp++;
				}
				if(tmp <= n) break;
				else {
					cnt[g.charAt(l) - 'a']--;
					l++;
				}
			}
			
			max = Math.max(max, r - l + 1);
		}
		sb.append(max);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
