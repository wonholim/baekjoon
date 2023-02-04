

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<Integer, Integer> m = new HashMap<>();
		int max = 0;
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			max = Math.max(max, sum);
			m.put(sum, i + 1);
		}
		sb.append(m.get(max) + " " + max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
