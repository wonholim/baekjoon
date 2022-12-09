

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] cnt;
	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			cnt = new int[n + 1];
			boolean check = false;
			int count = 0;
			while(t2 --> 0) {
				st = new StringTokenizer(br.readLine());
				cnt[Integer.parseInt(st.nextToken())]++;
				cnt[Integer.parseInt(st.nextToken())]++;
				if(!check) {check = checking(); count++;}
			}
			sb.append(n - 1 + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean checking() {
		// TODO Auto-generated method stub
		for(int i = 1; i < n + 1; i++) {
			if(cnt[i] == 0) return false;
		}
		return true;
	}

}
