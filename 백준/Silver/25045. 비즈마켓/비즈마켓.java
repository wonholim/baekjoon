

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
		int p = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		ArrayList<Long> a = new ArrayList<>();
		ArrayList<Long> b = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < p; i++) {
			a.add(Long.parseLong(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			b.add(Long.parseLong(st.nextToken()));
		}
		Collections.sort(a, Collections.reverseOrder());
		Collections.sort(b);
		long sum = 0;
		if(p >= t) {
			for(int i = 0; i < b.size(); i++) {
				if(a.get(i) - b.get(i) <= 0) break;
				else sum += a.get(i) - b.get(i);
			}
		}else {
			for(int i = 0; i < a.size(); i++) {
				if(a.get(i) - b.get(i) <= 0) break;
				else sum += a.get(i) - b.get(i);
			}
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
