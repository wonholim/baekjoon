

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
		ArrayList<String> list = new ArrayList<>();
		st.nextToken();
		String sex = st.nextToken();
		int max = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String cex = st.nextToken();
			int dis = Integer.parseInt(st.nextToken());
			if(sex.equals("MF") || sex.equals("FM")) {
				if(max >= dis) {
					list.add(name);
				}
			}else {
				if(sex.equals(cex)) {
					if(max >= dis) {
						list.add(name);
					}
				}
			}
		}
		Collections.sort(list);
		if(list.isEmpty()) sb.append("No one yet");
		else {
			for(String g : list) {
				sb.append(g + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
