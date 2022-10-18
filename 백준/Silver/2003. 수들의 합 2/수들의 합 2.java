

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		int b = Integer.parseInt(st.nextToken());
		int[] c = new int[a];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		for(int i = 0; i < a; i++) {
			int sum = c[i];
			if(sum == b) {count++; continue;}
			for(int j = i + 1; j < a; j++) {
				sum += c[j];
				if(sum == b) {count++; break;}
				else if(sum < b) {continue;}
				else break;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
