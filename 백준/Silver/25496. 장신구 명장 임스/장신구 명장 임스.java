

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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		int count = 0;
		while(p < 200) {
			if(list.isEmpty()) break;
			p += list.remove(0);
			count++;
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
