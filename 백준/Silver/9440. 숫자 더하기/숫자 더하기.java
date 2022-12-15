

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
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			ArrayList<Integer> list = new ArrayList<>();
			if(k == 0) break;
			for(int i = 0; i < k; i++) list.add(Integer.parseInt(st.nextToken()));
			if(k % 2 == 0) {
				Collections.sort(list);
				String a = "";
				String b = "";
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) == 0)
						continue;
					else {
						a += list.remove(i);
						break;
					}
				}
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) == 0)
						continue;
					else {
						b += list.remove(j);
						break;
					}
				}
				while(!list.isEmpty()) {
					a += list.remove(0);
					b += list.remove(0);
				}
				sb.append(Integer.parseInt(a) + Integer.parseInt(b));
			}else {
				Collections.sort(list);
				String a = "";
				String b = "";
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) == 0)
						continue;
					else {
						a += list.remove(i);
						break;
					}
				}
				while(!list.isEmpty()) {
					a += list.remove(0);
					if(b.length() == 0) {
						for (int j = 0; j < list.size(); j++) {
							if (list.get(j) == 0)
								continue;
							else {
								b += list.remove(j);
								break;
							}
						}
					}else {
						b += list.remove(0);
					}
				}
				sb.append(Integer.parseInt(a) + Integer.parseInt(b));
			}
			sb.append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
