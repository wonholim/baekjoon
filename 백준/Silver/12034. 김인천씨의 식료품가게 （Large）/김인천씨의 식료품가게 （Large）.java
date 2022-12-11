

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int i = 1;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			ArrayList<Integer> ans = new ArrayList<>();
			ArrayList<Integer> list = new ArrayList<>();
			int n = Integer.parseInt(br.readLine()) * 2;
			st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list, Collections.reverseOrder());
			while(!list.isEmpty()) {
				int k = (list.get(0) / 4) * 3;
				for(int j = 0; j < list.size(); j++) {
					if(k == list.get(j)) {
						list.remove(j);
						list.remove(0);
						ans.add(k);
					}
				}
			}
			Collections.sort(ans);
			sb.append("Case #" + i + ": ");
			for(int k : ans) {
				sb.append(k + " ");
			}
			sb.append("\n");
			i++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
