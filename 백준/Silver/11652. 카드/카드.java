

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		long[] a = new long[t];
		for (int i = 0; i < t; i++) {
			a[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(a);
		int modeCnt = 1;
		int curCnt = 1;
		long mode = a[0];
		for(int i = 1; i < t; i++) {
			if(a[i - 1] == a[i]) {
				curCnt++;
			}else {
				curCnt = 1;
			}
			if(modeCnt < curCnt) {
				modeCnt = curCnt;
				mode = a[i];
			}
		}
		sb.append(mode);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
