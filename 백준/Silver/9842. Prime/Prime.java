

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] a = new boolean[150000];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2; i < 150000; i++) {
			if(a[i]) continue;
			else list.add(i);
			for(int j = 2 * i; j < 150000; j = i + j) {
				a[j] = true;
			}
		}
		sb.append(list.get(Integer.parseInt(st.nextToken()) - 1));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
