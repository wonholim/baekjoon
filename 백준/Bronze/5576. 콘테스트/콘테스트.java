

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
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < 10; i++) list.add(Integer.parseInt(br.readLine()));
		for(int i = 0; i < 10; i++) list1.add(Integer.parseInt(br.readLine()));
		Collections.sort(list, Collections.reverseOrder());
		Collections.sort(list1, Collections.reverseOrder());
		int a = 0;
		int b = 0;
		for(int i = 0; i < 3; i++) {
			a += list.get(i);
			b += list1.get(i);
		}
		sb.append(a + " " + b);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
