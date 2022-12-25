

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String line = st.nextToken();
		StringBuilder sbd;
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < line.length() - 2; i++) {
			for(int j = i + 1; j < line.length() - 1; j++) {
				for(int k = j + 1; k < line.length(); k++) {
					sbd = new StringBuilder();
					String one = line.substring(i, j);
					one = sbd.append(one).reverse().toString();
					sbd.setLength(0);
					String two = line.substring(j, k);
					two = sbd.append(two).reverse().toString();
					sbd.setLength(0);
					String three = line.substring(k, line.length());
					three = sbd.append(three).reverse().toString();
					sbd.setLength(0);
					if((one.length() + two.length() + three.length()) == line.length()) list.add(one + two + three);
				}
			}
		}
		Collections.sort(list);
		sb.append(list.get(0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
