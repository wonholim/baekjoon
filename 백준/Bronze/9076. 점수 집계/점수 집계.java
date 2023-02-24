

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
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < 5; i++) list.add(Integer.parseInt(st.nextToken()));
			Collections.sort(list);
			int a = list.get(3) - list.get(1);
			int sum = 0;
			for(int i = 0; i < 5; i++) {
				sum += list.get(i);
			}
			sum = sum - (list.get(4) + list.get(0));
			if(a >= 4) sb.append("KIN\n");
			else {
				sb.append(sum + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
