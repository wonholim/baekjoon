

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static Map<Integer, Integer> m;
	static boolean[] b;
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		b = new boolean[100001];
		for(int i = 2; i < b.length; i++) {
			if(b[i]) continue; 
			else list.add(i);
			for(int j = 2 * i; j < b.length; j = i + j) {
				b[j] = true;
			}
		}
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			m = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			int i = 0;
			while(true) {
				if(n == 1) break;
				if(n % list.get(i) == 0) {
					m.put(list.get(i), m.getOrDefault(list.get(i), 0) + 1);
					n = n / list.get(i);
				}else {
					i++;
				}
			}
			for(int k : list) {
				if(m.get(k) != null) {
					sb.append(k + " " + m.get(k) + "\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
