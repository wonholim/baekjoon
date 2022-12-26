

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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] a = new boolean[1500001];
		for(int i = 2; i < 1500001; i++) {
			if(a[i]) continue;
			for(int j = 2 * i; j < 1500001; j = i + j) {
				a[j] = true;
			}
		}
		ArrayList<String> list = new ArrayList<>();
		for(int i = 2; i < 1500001; i++) {
			if(!a[i]) list.add(Integer.toString(i));
		}
		int x = Integer.parseInt(st.nextToken()) - 1;
		int y = Integer.parseInt(st.nextToken()) - 1;
		String k = br.readLine();
		int count = 0;
		for(int i = x; i <= y; i++) {
			if(list.get(i).contains(k)) count++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
