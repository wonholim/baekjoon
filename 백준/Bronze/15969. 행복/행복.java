

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int min = 1001;
		int max = 0;
		for(int i = 0; i < a; i++) {
			int b = Integer.parseInt(st.nextToken());
			min = Math.min(min, b);
			max = Math.max(max, b);
		}
		sb.append(max - min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
