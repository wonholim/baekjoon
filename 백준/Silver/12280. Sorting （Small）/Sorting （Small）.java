

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= t; i++){
			sb.append("Case #" + i + ": ");
			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			int t2 = Integer.parseInt(br.readLine());
			boolean[] n = new boolean[t2];
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < t2; j++) {
				int k = Integer.parseInt(st.nextToken());
				if (k % 2 == 0) {
					a.add(k);
					n[j] = true;
				}else {
					b.add(k);
				}
			}
			Collections.sort(a, Collections.reverseOrder());
			Collections.sort(b);
			for(int k = 0; k < t2; k++) {
				if(n[k]) sb.append(a.remove(0) + " ");
				else sb.append(b.remove(0) + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
