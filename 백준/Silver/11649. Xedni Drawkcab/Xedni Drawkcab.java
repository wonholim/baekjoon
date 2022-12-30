

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		StringBuilder rev;
		ArrayList<String> list = new ArrayList<>();
		while(t --> 0) {
			rev = new StringBuilder();
			rev.append(br.readLine());
			list.add(rev.reverse().toString());
			
		}
		Collections.sort(list);
		for(String k : list) sb.append(k + "\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
