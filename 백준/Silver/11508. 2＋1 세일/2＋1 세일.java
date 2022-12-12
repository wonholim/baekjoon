

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
		ArrayList<Integer> list = new ArrayList<>();
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list, Collections.reverseOrder());
		long sum = 0;
		for(int i = 0; i < t; i++) {
			if((i + 1) % 3 != 0) {
				sum += list.get(i);
			}
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
