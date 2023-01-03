

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] c = new int[5];
		for(int i = 0; i < 5; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		while(true) {
			boolean check = false;
			for(int j = 1; j < 5; j++) {
				if(c[j - 1] > c[j]) {
					int tmp = c[j - 1];
					c[j - 1] = c[j];
					c[j] = tmp;
					check = true;
					for(int k : c) {
						sb.append(k + " ");
					}
					sb.append("\n");
				}
			}
			if(!check) {
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
